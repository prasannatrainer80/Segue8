import { Component, ViewChild } from '@angular/core';
import { Employee } from '../employee';
import { MatTableDataSource } from '@angular/material/table';
import { MatSort } from '@angular/material/sort';
import { MatPaginator } from '@angular/material/paginator';
@Component({
  selector: 'app-mat-sort-ex',
  templateUrl: './mat-sort-ex.component.html',
  styleUrl: './mat-sort-ex.component.css'
})
export class MatSortExComponent {
  displayedColumns: string[] = [
    'id',
    'firstname',
    'lastname',
    'email',
    'gender',
    'jobtitle',
    'department',
  ];

  employs = [
    new Employee(1,'Raj','Kishore','raj@gmail.com','Male','Support','Angular'),
    new Employee(2,'Nama','Shivayam','shiva@gmail.com','Male','Manager','Angular'),
    new Employee(3,'Sunitya','S','sunitha@gmail.com','Female','Tester','React'),
    new Employee(4,'Mani','Roushan','mani@gmail.com','Male','Coding','Angular'),
    new Employee(5,'Cherish','V','cheri@gmail.com','Male','Support','Sql'),
    new Employee(6,'Stuti','Singh','stuti@gmail.com','Female','Sql','DBA'),
    new Employee(7,'Shwetha','Srivasthav','sv@gmail.com','Female','Support','Angular'),
    new Employee(8,'Venkatesh','V','ven@gmail.com','Male','Manager','Angular'),
   
  ]

  @ViewChild(MatSort) sort = {} as MatSort;
  @ViewChild(MatPaginator) paginator = {} as MatPaginator;
  
  dataSource = new MatTableDataSource(this.employs);

  constructor() {}

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  ngOnInit(): void {}
}
