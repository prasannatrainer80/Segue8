import { Component } from '@angular/core';
import { CustomerServiceService } from '../customer-service.service';
import { Wallet } from '../wallet';

@Component({
  selector: 'app-customer-wallet',
  templateUrl: './customer-wallet.component.html',
  styleUrl: './customer-wallet.component.css'
})
export class CustomerWalletComponent {
  cid : number;
  wallet : Wallet[];
  constructor(private _customerService : CustomerServiceService) {
    this.cid = parseInt(localStorage.getItem("cid"));
    this._customerService.showCustomerWallet(this.cid).subscribe(x => {
      this.wallet = x;
    })
  }
}
