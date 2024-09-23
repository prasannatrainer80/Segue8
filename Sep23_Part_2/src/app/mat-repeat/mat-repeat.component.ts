import { Component, ViewChild } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';
import { MatTableDataSource } from '@angular/material/table';
import { MatSort } from '@angular/material/sort';
import { MatPaginator } from '@angular/material/paginator';

@Component({
  selector: 'app-mat-repeat',
  templateUrl: './mat-repeat.component.html',
  styleUrl: './mat-repeat.component.css'
})
export class MatRepeatComponent {

  displayedColumns: string[] = [
    'empno',
    'name',
    'gender',
    'dept',
    'desig',
    'basic'
  ];


  dataSource = new MatTableDataSource<Employ>;
  @ViewChild(MatSort) sort = {} as MatSort;
  @ViewChild(MatPaginator) paginator = {} as MatPaginator;
  employs : Employ[];
  constructor(private _employService : EmployService) {
    this._employService.showEmploy().subscribe(x => 
    {
      this.employs = x;
      this.dataSource = new MatTableDataSource(this.employs);
      this.dataSource.sort = this.sort
      this.dataSource.paginator = this.paginator;
    }
    )
  }
}
