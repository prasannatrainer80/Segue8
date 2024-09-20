import { Component } from '@angular/core';
import { Employ } from '../employ';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-employ-insert',
  templateUrl: './employ-insert.component.html',
  styleUrl: './employ-insert.component.css'
})
export class EmployInsertComponent {
  employ : Employ;
  isValid : boolean;
  msg :string;
  constructor() {
    this.employ = new Employ();
    this.isValid = false;
  }

  add(employForm : NgForm) {
    if (employForm.invalid) {
      return;
    }
    this.isValid = true;
  }

}
