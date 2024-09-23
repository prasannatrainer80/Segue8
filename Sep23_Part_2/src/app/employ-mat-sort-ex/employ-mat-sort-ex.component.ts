import { Component, ViewChild } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';
import { MatSort } from '@angular/material/sort';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-employ-mat-sort-ex',
  templateUrl: './employ-mat-sort-ex.component.html',
  styleUrl: './employ-mat-sort-ex.component.css'
})
export class EmployMatSortExComponent {

  
  displayedColumns: string[] = [
    'empno',
    'name',
    'gender',
    'dept',
    'desig',
    'basic'
  ];

  employs : Employ[];
  dataSource = new MatTableDataSource<Employ>;
  @ViewChild(MatSort) sort = {} as MatSort;
  @ViewChild(MatPaginator) paginator = {} as MatPaginator;

 
  // dataSource : MatTableDataSource;

  constructor(private _employService : EmployService) {
    this._employService.showEmploy().subscribe(x => {
      this.employs = x;
      this.dataSource = new MatTableDataSource(this.employs);
      this.dataSource.sort = this.sort
      this.dataSource.paginator = this.paginator;
      // alert(x);
    })
  }

 

  ngOnInit(): void {}
}
