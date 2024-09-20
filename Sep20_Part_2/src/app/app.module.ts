import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { CustomerLoginComponent } from './customer-login/customer-login.component';
import { CustomerDashBoardComponent } from './customer-dash-board/customer-dash-board.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { CustomerInfoComponent } from './customer-info/customer-info.component';
import { CustomerWalletComponent } from './customer-wallet/customer-wallet.component';
import { CustomerOrdersComponent } from './customer-orders/customer-orders.component';
import { CustomerPendingOrdersComponent } from './customer-pending-orders/customer-pending-orders.component';

const routes : Routes =
[
  {path:'',component:CustomerLoginComponent},
  {path:'dashBoard',component:CustomerDashBoardComponent},
  {path:'dashBoard',component:CustomerDashBoardComponent,children: [
    {path:'customerInfo',component:CustomerInfoComponent, outlet:'hexa'},
    {path:'customerWallet',component:CustomerWalletComponent,outlet:'hexa'},
    {path:'customerOrders',component:CustomerOrdersComponent,outlet:'hexa'},
    {path:'customerPendingOrders',component:CustomerPendingOrdersComponent,outlet:'hexa'}
  ]},
  

]
@NgModule({
  declarations: [
    AppComponent,
    CustomerLoginComponent,
    CustomerDashBoardComponent,
    CustomerInfoComponent,
    CustomerWalletComponent,
    CustomerOrdersComponent,
    CustomerPendingOrdersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
