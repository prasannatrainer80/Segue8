import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  userName : string;
  passWord : string;

  constructor(private _router : Router) {

  }
  login() {
    if (this.userName=="Hexa" && this.passWord=="Hexa") {
      this._router.navigate(["menu"]);
    }
  }
}
