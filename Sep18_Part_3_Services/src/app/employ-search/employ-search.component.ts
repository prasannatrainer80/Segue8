import { Component } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';

@Component({
  selector: 'app-employ-search',
  templateUrl: './employ-search.component.html',
  styleUrl: './employ-search.component.css'
})
export class EmploySearchComponent {
  eno : number;
  employ : Employ;
  showEmploy() {
    this._employService.searchEmploy(this.eno).subscribe(x => {
      this.employ = x;
    })
  }
  constructor(private _employService : EmployService) {
  
  }
}
