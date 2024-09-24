import { Component } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';
import { AuthRequest } from '../auth-request';

@Component({
  selector: 'app-generate-token',
  templateUrl: './generate-token.component.html',
  styleUrl: './generate-token.component.css'
})
export class GenerateTokenComponent {

  userName : string;
  passWord : string;
  result : any;
  authRequest : AuthRequest;
  jwt : string;
  generate() {
    this.authRequest.username = this.userName;
    this.authRequest.password = this.passWord;
    // alert(this.authRequest.username);
    // alert(this.authRequest.username);
   
    this._authService.generateTokenNew(this.authRequest).subscribe(x => {
      localStorage.setItem("jwt",x);
      this.jwt = x;
      // alert(x);
      // this.result = x;
    })
  }
  constructor(private _authService : AuthServiceService) {
    this.authRequest = new AuthRequest();
 
 
  }
}
