import { Component } from '@angular/core';

@Component({
  selector: 'app-third',
  templateUrl: './third.component.html',
  styleUrl: './third.component.css'
})
export class ThirdComponent {
  name : string;
  city : string;
  company : string;

  constructor() {
    this.name = "Prasanna"
    this.city = "Hyderabad"
    this.company = "Hexaware"
  }
}
