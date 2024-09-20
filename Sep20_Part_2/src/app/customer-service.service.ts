import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {

  constructor(private _httpClient : HttpClient) { }

  validateCustomer(user : string, pwd : string) : Observable<any> {
    return this._httpClient.get("http://localhost:1111/custAuthenticate/"+user+"/"+pwd);
  }

  searchByUserName(user : string) : Observable<any> {
    return this._httpClient.get("http://localhost:1111/searchByUser/" +user);
  }

  showCustomerInfo(cid : number) : Observable<any> {
    return this._httpClient.get("http://localhost:1111/customer/"+cid);
  }

  showCustomerWallet(cid : number) : Observable<any> {
    return this._httpClient.get("http://localhost:1111/showCustomerWallet/"+cid);
  }

  showCustomerOrders(cid : number) : Observable<any> {
    return this._httpClient.get("http://localhost:1111/customerPendingOrders/"+cid);
  }

  showCustomerPendingOrders(cid : number) : Observable<any> {
    return this._httpClient.get("http://localhost:1111/customerOrders/"+cid);
  }
}
