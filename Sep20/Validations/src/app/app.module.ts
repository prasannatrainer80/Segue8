import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { EmployInsertComponent } from './employ-insert/employ-insert.component';
import { LoginComponent } from './login/login.component';
import { ValidationExComponent } from './validation-ex/validation-ex.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployInsertComponent,
    LoginComponent,
    ValidationExComponent
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
