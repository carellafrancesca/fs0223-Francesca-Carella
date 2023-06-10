import { Component } from '@angular/core';
import { AuthService } from '../auth.service';
import { Register } from '../interfaces/register';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent {

  constructor(
    private authSvc: AuthService,
    private router: Router
  ){}

  data:Register = {
    email: '',
    password: '',
    name: '',
    surname: ''
  };

  register(){
    this.authSvc.signUp(this.data)
    .subscribe(accessData => {
      this.router.navigate(['auth/login'])
    })
  }

}
