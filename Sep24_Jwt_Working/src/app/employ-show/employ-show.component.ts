import { Component } from '@angular/core';
import { Employ } from '../employ';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-employ-show',
  templateUrl: './employ-show.component.html',
  styleUrl: './employ-show.component.css'
})
export class EmployShowComponent {

  employs : Employ[];
  token : string;
  constructor(private _authService : AuthServiceService) {
    this.token = localStorage.getItem("jwt")
    this._authService.showEmploy(this.token).subscribe(x => {
      this.employs =x;
    })
    localStorage.removeItem("jwt");
  }
}
