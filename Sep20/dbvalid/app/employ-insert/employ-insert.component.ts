import { Component } from '@angular/core';
import { Employ } from '../employ';
import { NgForm } from '@angular/forms';
import { EmployService } from '../employ.service';

@Component({
  selector: 'app-employ-insert',
  templateUrl: './employ-insert.component.html',
  styleUrl: './employ-insert.component.css'
})
export class EmployInsertComponent {

  employ : Employ;
  result : string;
  isValid : boolean;
  msg :string;
  constructor(private _employService : EmployService) {
    this.employ = new Employ();
    this.isValid = false;
  }

  add(employForm : NgForm) {
   if (employForm.invalid) {
    return;
   }
  //  alert(employForm.invalid);
  //  alert(this.isValid);
   this.isValid = true;
    // alert(this.employ.empno + " " +this.employ.name + " " +this.employ.gender + " " +
      // this.employ.dept + " " +this.employ.desig + " " +this.employ.basic);
   
      this._employService.addEmploy(this.employ).subscribe(x => {
        alert(x);
        this.result = x;
      })

      // alert(this.result);
    
  }

}
