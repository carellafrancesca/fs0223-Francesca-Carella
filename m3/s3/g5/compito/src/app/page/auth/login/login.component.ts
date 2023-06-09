import { AccessInfo } from './../interfaces/access-info';
import { Component } from '@angular/core';
import { AuthService } from '../auth.service';
import { Login } from '../interfaces/login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  constructor(
    private authSvc: AuthService
  ){}

  data:Login = {
    email:'',
    password: ''
  }

  login() {
    console.log(this.data);
    this.authSvc.login(this.data).subscribe((AccessInfo: AccessInfo) => {
      alert(`Sei loggato come ${AccessInfo.user.name}`);
    });
  }

}
