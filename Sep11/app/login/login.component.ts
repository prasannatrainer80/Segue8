import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  userName : string;
  passCode : string;

  login() {
    if (this.userName=="Hexaware" && this.passCode == "Hexaware") {
      alert("Correct Credentials...");
    } else {
      alert("Invalid Credentials...");
    }
  }
}
