import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { GenerateTokenComponent } from './generate-token/generate-token.component';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { MenuComponent } from './menu/menu.component';
import { RouterModule, Routes } from '@angular/router';

const routes : Routes = 
[
  {path:'',component:MenuComponent},
  {path:'generateToken',component:GenerateTokenComponent},
  {path:'employShow',component:EmployShowComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    GenerateTokenComponent,
    EmployShowComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
