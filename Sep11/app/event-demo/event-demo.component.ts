import { Component } from '@angular/core';

@Component({
  selector: 'app-event-demo',
  templateUrl: './event-demo.component.html',
  styleUrl: './event-demo.component.css'
})
export class EventDemoComponent {

  mani() {
    alert("Hi I am Mani...")
  }

  malar() {
    alert("Hi I am Malar...")
  }

  shweta() {
    alert("Hi I am Shweta...")
  }
}
