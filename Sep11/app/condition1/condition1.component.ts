import { Component } from '@angular/core';

@Component({
  selector: 'app-condition1',
  templateUrl: './condition1.component.html',
  styleUrl: './condition1.component.css'
})
export class Condition1Component {
  status : boolean
  constructor() {
    this.status = false
  }
}
