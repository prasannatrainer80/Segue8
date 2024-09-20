import { Component } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-employ-update',
  templateUrl: './employ-update.component.html',
  styleUrl: './employ-update.component.css'
})
export class EmployUpdateComponent {
  employ : Employ;
  result : string;
  // isValid : boolean;
  // msg :string;
  constructor(private _employService : EmployService) {
    this.employ = new Employ();
    // this.isValid = false;
  }

  add(employForm : NgForm) {
   
    alert(this.employ.empno + " " +this.employ.name + " " +this.employ.gender + " " +
      this.employ.dept + " " +this.employ.desig + " " +this.employ.basic);
   
      this._employService.updateEmploy(this.employ).subscribe(x => {
        this.result = x;
      })

      alert(this.result);
    
  }
}
