import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UserShowComponent } from './user-show/user-show.component';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { EmploySearchComponent } from './employ-search/employ-search.component';
import { EmployInsertComponent } from './employ-insert/employ-insert.component';
import { EmployUpdateComponent } from './employ-update/employ-update.component';
import { EmployDeleteComponent } from './employ-delete/employ-delete.component';

@NgModule({
  declarations: [
    AppComponent,
    UserShowComponent,
    EmployShowComponent,
    EmploySearchComponent,
    EmployInsertComponent,
    EmployUpdateComponent,
    EmployDeleteComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
