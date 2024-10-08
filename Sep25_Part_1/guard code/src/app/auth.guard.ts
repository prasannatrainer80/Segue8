import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, CanActivateFn, GuardResult, MaybeAsync, Router, RouterStateSnapshot } from '@angular/router';
import { AuthService } from './auth.service';

@Injectable({
  providedIn : 'root'
})

export class AuthGuard implements CanActivate {
  constructor(private _authService : AuthService, 
    private _router : Router
  ) {

  }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
    let isLoggedIn = this._authService.isAuthenticated();
    if (isLoggedIn) {
      return true;
    } else {
      this._router.navigate(['error']);
      return false;
    }
  }
}