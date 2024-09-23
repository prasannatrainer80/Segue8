import { Component } from '@angular/core';
import { EmployService } from '../employ.service';
import { Employ } from '../employ';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-employ-show',
  templateUrl: './employ-show.component.html',
  styleUrl: './employ-show.component.css'
})
export class EmployShowComponent {



  displayedColumns: string[] = [
    'empno',
    'name',
    'gender',
    'dept',
    'desig',
    'basic'
  ];

  employs : Employ[];

 
  constructor(private _employService : EmployService) {
    this._employService.showEmploy().subscribe(x => {
      this.employs = x;
    })
   

  }
}
