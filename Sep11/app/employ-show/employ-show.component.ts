import { Component } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-show',
  templateUrl: './employ-show.component.html',
  styleUrl: './employ-show.component.css'
})
export class EmployShowComponent {
  employs = [
    new Employ(1, "Cherish","Java","Programmer",88224),
    new Employ(2, "Madhavan","Dotnet","Developer",90022),
    new Employ(3, "Pravin","Sql","Manager",90022),
    new Employ(4, "Shashanthika","Angular","Programmer",86622),
    new Employ(5, "Vibhuti","React","Programmer",77733),
    
  ]
}
