import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, tap } from 'rxjs';
import { AuthRequest } from './auth-request';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor(private _http : HttpClient) { }

//   generateTokenNew(authRequest : AuthRequest): Observable<any> {
    
//     var headers = new HttpHeaders().set('Content-Type', 'text/plain; charset=utf-8');

//     return this._http.post<any>("http://localhost:1122/employ/generateToken",authRequest, { headers, responseType: 'text' as 'json' });
// }

showEmploy(token : string) : Observable<any> {
  var headers_object = new HttpHeaders({
    "Content-Type":"application/json",
    "Authorization":"Bearer "+token
  });

  const httpOptions = {
    headers : headers_object
  }

 return this._http.get("http://localhost:1122/employ/showEmploy",httpOptions)
}
  generateTokenNew(authRequest : AuthRequest) : Observable<any> {
    return this._http.post("http://localhost:1122/employ/generateToken",authRequest, {responseType:'text'}).pipe(
      tap((resp) => {
        alert(resp);
      })
    )
  }
  // generateToken(authRequest : AuthRequest) : Observable<any> {
  //   return this._http.post<any>("http://localhost:1122/employ/generateToken",authRequest)
  //   .pipe(
  //     tap((response) => {
  //       alert(response);
  //       if (response && response.token) {
  //         localStorage.setItem("jwt_token",response.token);
  //         alert("Success...Token Generated");
  //       }
  //     })
  //   )
  // }
}
