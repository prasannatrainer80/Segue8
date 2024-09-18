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
import { LoginComponent } from './login/login.component';

const routes : Routes = 
[
  {path:'',component:LoginComponent},
  {path:'menu',component:MenuComponent},
  {path:'menu',component:MenuComponent,children:[
    {path:'first',component:FirstComponent,outlet:'hexa'},
    {path:'second',component:SecondComponent,outlet:'hexa'},
    {path:'third',component:ThirdComponent,outlet:'hexa'},
    {path:'event',component:EventDemoComponent,outlet:'hexa'},
    {path:'twoway',component:TwoWayComponent,outlet:'hexa'},
    {path:'calc',component:CalcComponent,outlet:'hexa'},
    {path:'condition',component:Condition1Component,outlet:'hexa'},
    {path:'switchcase',component:SwitchExComponent,outlet:'hexa'},
    {path:'employshow',component:EmployShowComponent,outlet:'hexa'}
  ]}
  
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
    MenuComponent,
    LoginComponent
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
