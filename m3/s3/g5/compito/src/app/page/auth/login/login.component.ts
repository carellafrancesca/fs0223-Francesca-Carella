import { AccessInfo } from './../interfaces/access-info';
import { Component } from '@angular/core';
import { AuthService } from '../auth.service';
import { Login } from '../interfaces/login';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  constructor(
    private authSvc: AuthService,
    private router: Router
  ){}

  data:Login = {
    email:'',
    password: ''
  }

  login(){
    this.authSvc.login(this.data)
    .subscribe(accessData => {
        this.router.navigate(['/dashboard'])
    })
  }

}
