import { Component } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-allowme',
  templateUrl: './allowme.component.html',
  styleUrl: './allowme.component.css'
})
export class AllowmeComponent {

  constructor(private _authService : AuthService) {
    this._authService.changeAuth();
    alert(this._authService.isLoggedIn);
  }
}
