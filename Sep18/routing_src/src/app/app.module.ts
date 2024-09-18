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
import { MenuComponent } from './menu/menu.component';
import { RouterModule, Routes } from '@angular/router';

const routes : Routes = 
[
  {path:'',component:MenuComponent},
  {path:'first',component:FirstComponent},
  {path:'second',component:SecondComponent},
  {path:'third',component:ThirdComponent},
  {path:'event',component:EventDemoComponent},
  {path:'twoway',component:TwoWayComponent},
  {path:'calc',component:CalcComponent},
  {path:'condition',component:Condition1Component},
  {path:'switchcase',component:SwitchExComponent},
  {path:'employshow',component:EmployShowComponent}
]
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
    EmployShowComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
