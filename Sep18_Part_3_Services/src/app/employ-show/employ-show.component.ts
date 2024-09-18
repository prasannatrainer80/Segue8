import { Component } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';

@Component({
  selector: 'app-employ-show',
  templateUrl: './employ-show.component.html',
  styleUrl: './employ-show.component.css'
})
export class EmployShowComponent {

  employs : Employ[];

  constructor(private _employServive : EmployService) {
    this._employServive.showEmploy().subscribe(x => {
      this.employs = x;
    })
  }
}
