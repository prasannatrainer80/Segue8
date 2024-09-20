import { Component } from '@angular/core';
import { Orders } from '../orders';
import { CustomerServiceService } from '../customer-service.service';

@Component({
  selector: 'app-customer-pending-orders',
  templateUrl: './customer-pending-orders.component.html',
  styleUrl: './customer-pending-orders.component.css'
})
export class CustomerPendingOrdersComponent {
  cid : number;
  orders : Orders[];
  constructor(private _customerService : CustomerServiceService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    this._customerService.showCustomerPendingOrders(this.cid).subscribe(x => {
      this.orders = x;
    })
  }
}
