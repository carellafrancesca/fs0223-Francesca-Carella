import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { JwtHelperService } from '@auth0/angular-jwt';
import { BehaviorSubject, map, tap, catchError, throwError } from 'rxjs';
import { environment } from 'src/environments/environment.development';
import { AccessInfo } from './interfaces/access-info';
import { Login } from './interfaces/login';
import { Register } from './interfaces/register';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  jwtHelper:JwtHelperService = new JwtHelperService();
  apiUrl = environment.apiUrl;

  private authSubject = new BehaviorSubject<null | AccessInfo>(null);

  user$ = this.authSubject.asObservable();
  isLoggedIn$ = this.user$.pipe(map(dato => Boolean(dato)));

  authLogoutTimer:any;

  constructor(
    private http: HttpClient,
    private router: Router
  ) {
    this.restoreUser();
   }

   login(data:Login){
    return this.http.post<AccessInfo>(this.apiUrl + '/login', data)
    .pipe(tap(data =>{
      this.authSubject.next(data);
      localStorage.setItem('user', JSON.stringify(data))

      const expDate = this.jwtHelper
      .getTokenExpirationDate(data.accessToken) as Date;
      this.autoLogout(expDate)
    }),
      catchError(this.errors)
    )
  }

  restoreUser(){
    const userJson = localStorage.getItem('user');
    if(!userJson){
      return
    }
    const user:AccessInfo = JSON.parse(userJson)
    if(this.jwtHelper.isTokenExpired(user.accessToken)){
      return;
    }
    this.authSubject.next(user);
  }

  signUp(data:Register){
    return this.http.post<AccessInfo>(this.apiUrl + '/register', data)
    .pipe(catchError(this.errors));
  }

  logout(){
    this.authSubject.next(null);
    localStorage.removeItem('user');
    this.router.navigate(['/login']);
    if(this.authLogoutTimer){
      clearTimeout(this.authLogoutTimer);
    }
  }

  autoLogout(expDate:Date){
    const expMs = expDate.getTime() - new Date().getTime();
    this.authLogoutTimer = setTimeout(()=>{
      this.logout();
    }, expMs)
  }

  errors(err: any) {
    switch (err.error) {
        case "Email and Password are required":
            return throwError('Email e password obbligatorie');
            break;
        case "Email already exists":
            return throwError('Utente esistente');
            break;
        case 'Email format is invalid':
            return throwError('Email scritta male');
            break;
        case 'Cannot find user':
            return throwError('utente inesistente');
            break;
            default:
        return throwError('Errore');
            break;
    }
  }

}
