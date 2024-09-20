import { Component } from '@angular/core';
import { Orders } from '../orders';
import { CustomerServiceService } from '../customer-service.service';

@Component({
  selector: 'app-customer-orders',
  templateUrl: './customer-orders.component.html',
  styleUrl: './customer-orders.component.css'
})
export class CustomerOrdersComponent {
  cid : number;
  orders : Orders[];
  constructor(private _customerService : CustomerServiceService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    this._customerService.showCustomerOrders(this.cid).subscribe(x => {
      this.orders = x;
    })
  }
}
