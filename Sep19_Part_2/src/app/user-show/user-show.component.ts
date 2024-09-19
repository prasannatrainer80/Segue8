import { Component } from '@angular/core';
import { Users } from '../users';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-user-show',
  templateUrl: './user-show.component.html',
  styleUrl: './user-show.component.css'
})
export class UserShowComponent {

  users : Users[];

  constructor(private _userService : UsersService) {
    this._userService.showUsers().subscribe(x => {
      this.users = x;
    })
  }
}
