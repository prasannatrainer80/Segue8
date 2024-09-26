import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { Css1Component } from './css1/css1.component';
import { PlaceOrderComponent } from './place-order/place-order.component'

@NgModule({
  declarations: [
    AppComponent,
    Css1Component,
    PlaceOrderComponent
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
