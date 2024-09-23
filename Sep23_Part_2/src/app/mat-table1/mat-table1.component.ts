import { Component } from '@angular/core';
import { Employee } from '../employee';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-mat-table1',
  templateUrl: './mat-table1.component.html',
  styleUrl: './mat-table1.component.css'
})
export class MatTable1Component {
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

  
  dataSource = new MatTableDataSource(this.employs);

  constructor() {}

  ngAfterViewInit() {}

  ngOnInit(): void {}
}
