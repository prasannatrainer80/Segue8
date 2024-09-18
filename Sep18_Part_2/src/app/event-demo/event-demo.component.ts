import { Component } from '@angular/core';

@Component({
  selector: 'app-event-demo',
  templateUrl: './event-demo.component.html',
  styleUrl: './event-demo.component.css'
})
export class EventDemoComponent {
  sunitha() {
    alert("Hi I am Sunitha...")
  }

  raghu() {
    alert("Hi I am raghu...")
  }

  sabari() {
    alert("Hi I am Sabari...");
  }
}
