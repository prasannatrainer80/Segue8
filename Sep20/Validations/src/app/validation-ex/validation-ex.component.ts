import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-validation-ex',
  templateUrl: './validation-ex.component.html',
  styleUrl: './validation-ex.component.css'
})
export class ValidationExComponent {
  sno : number;
  sname : any;
  city : any;
  cgp : number;
  isValid : boolean;
  constructor() {
    this.isValid = false;
  }

  show(validationForm :NgForm) {
    if (validationForm.invalid) {
      return;
    }
    // console.log('dirty  ', this.sno.dirty);
    this.isValid = true;
  }

}
