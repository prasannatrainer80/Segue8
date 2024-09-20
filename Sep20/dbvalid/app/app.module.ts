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
import { MenuComponent } from './menu/menu.component';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';

const routes : Routes =
[
  {path:'',component:LoginComponent},
  {path:'menu',component:MenuComponent},
  {path:'menu',component:MenuComponent, children : 
    [
      {path:'employShow',component:EmployShowComponent,outlet:'hexa'},
      {path:'employSearch',component:EmploySearchComponent,outlet:'hexa'},
      {path:'employInsert',component:EmployInsertComponent, outlet:'hexa'},
      {path:'employUpdate',component:EmployUpdateComponent, outlet:'hexa'},
      {path:'employDelete',component:EmployDeleteComponent, outlet:'hexa'}
    ]
}
]
@NgModule({
  declarations: [
    AppComponent,
    UserShowComponent,
    EmployShowComponent,
    EmploySearchComponent,
    EmployInsertComponent,
    EmployUpdateComponent,
    EmployDeleteComponent,
    MenuComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
