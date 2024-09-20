import { Component } from '@angular/core';
import { Customer } from '../customer';
import { NgForm } from '@angular/forms';
import { CustomerServiceService } from '../customer-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-login',
  templateUrl: './customer-login.component.html',
  styleUrl: './customer-login.component.css'
})
export class CustomerLoginComponent {

  customer : Customer;
  isValid : boolean;
  customerFound : Customer;
  constructor(private _customerService : CustomerServiceService, 
    private _router : Router
  ) {
    this.customer = new Customer();
    this.isValid = false;
  }

  login(loginForm : NgForm) {
    if (loginForm.invalid) {
      return;
    }
    this.isValid = true;
    this._customerService.validateCustomer(this.customer.cusUsername,this.customer.cusPassword)
    .subscribe(x => {
      if (x=='1') {
        this._customerService.searchByUserName(this.customer.cusUsername).subscribe(x => {
          this.customerFound = x;
          localStorage.setItem("cid",this.customerFound.cusId.toString());
          // alert("Customer Id  is  " +localStorage.getItem("cid"));
        })
        this._router.navigate(["dashBoard"])
      } else {
        alert("Invalid Credentials...");
      }
    })
  }
}
