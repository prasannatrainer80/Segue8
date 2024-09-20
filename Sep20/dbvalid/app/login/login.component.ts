import { Component } from '@angular/core';
import { Users } from '../users';
import { EmployService } from '../employ.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  user : string;
  pwd  : string;
  constructor(private _employService : EmployService,
        private _router : Router
  ) {

  }

  login() {
    this._employService.login(this.user,this.pwd).subscribe(x => {
      alert(x);
      if (x===1) {
        this._router.navigate(["menu"]);
      //  alert("Correct");
      } else {
        alert("Invalid")
      }
    })
  }
}
