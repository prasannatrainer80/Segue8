import { Component } from '@angular/core';
import { EmployService } from '../employ.service';

@Component({
  selector: 'app-employ-delete',
  templateUrl: './employ-delete.component.html',
  styleUrl: './employ-delete.component.css'
})
export class EmployDeleteComponent {
 empno : number;
result : any;
 constructor(private _employService : EmployService) {

 }
 delete() {
  this._employService.deleteEmploy(this.empno).subscribe(x => {
    this.result = x;
  })
  alert(this.result);
 }
}
