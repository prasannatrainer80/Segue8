import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrl: './first.component.css'
})
export class FirstComponent {

  name : string;
  city : string;

  constructor(private _router : Router) {
    this.name = "Prasanna"
    this.city = "Hyderabad"
  }

  show() {
    this._router.navigate(['third',this.name, this.city]);
  }
}
