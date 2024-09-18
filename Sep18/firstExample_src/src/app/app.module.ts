import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { EventDemoComponent } from './event-demo/event-demo.component';
import { FormsModule } from '@angular/forms';
import { TwoWayComponent } from './two-way/two-way.component';
import { CalcComponent } from './calc/calc.component';
import { Condition1Component } from './condition1/condition1.component';
import { SwitchExComponent } from './switch-ex/switch-ex.component';
import { EmployComponent } from './employ/employ.component';
import { EmployShowComponent } from './employ-show/employ-show.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    ThirdComponent,
    EventDemoComponent,
    TwoWayComponent,
    CalcComponent,
    Condition1Component,
    SwitchExComponent,
    EmployComponent,
    EmployShowComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
