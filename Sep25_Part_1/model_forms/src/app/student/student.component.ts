import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrl: './student.component.css'
})
export class StudentComponent {
  isValidFormSubmitted: boolean = null;
	userForm = new FormGroup({
	   uname: new FormControl('', Validators.required),
	   gender: new FormControl('', Validators.required),
	   married: new FormControl(),
	   tc: new FormControl('', Validators.required)
	});

  onFormSubmit() {
    this.isValidFormSubmitted = false;
    if(this.userForm.invalid){
     return;	
    } 	
    this.isValidFormSubmitted = true;	
    console.log(this.userForm.valid);
 }
 reset() {
    this.userForm.reset({
       married: false
    });	
 }	
 setDefaultValues() {
    this.userForm.patchValue({uname: 'Krishna',
     gender:'male', married:true});
 }	
 ngOnInit(): void {
 }

	constructor() {
	}
}
