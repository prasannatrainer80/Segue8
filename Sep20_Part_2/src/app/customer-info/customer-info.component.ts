import { Component } from '@angular/core';
import { CustomerServiceService } from '../customer-service.service';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-info',
  templateUrl: './customer-info.component.html',
  styleUrl: './customer-info.component.css'
})
export class CustomerInfoComponent {

  cid : number;
  customer : Customer;
  constructor(private _customerService : CustomerServiceService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    // alert(this.cid);
    this._customerService.showCustomerInfo(this.cid).subscribe(x => {
      this.customer = x;
    })
  }
}
