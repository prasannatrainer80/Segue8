import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isLoggedIn = false;
  constructor() { }

  changeAuth() {
    this.isLoggedIn = true;
  }
  isAuthenticated() {
    return this.isLoggedIn;
  }
}
