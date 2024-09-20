import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employ } from './employ';

@Injectable({
  providedIn: 'root'
})
export class EmployService {

  constructor(private _http : HttpClient) { }

  login(user : string, pwd : string) : Observable<any> {
    return this._http.get("http://localhost:8181/api/login/"+user+"/"+pwd);
  }
  deleteEmploy(id : number) : Observable<any> {
    return this._http.delete("http://localhost:8181/api/deleteEmploy/"+id);
  }
  addEmploy(employ : Employ) : Observable<any> {
    return this._http.post("http://localhost:8181/api/addEmploy",employ);
  }

  updateEmploy(employ : Employ) : Observable<any> {
    return this._http.put("http://localhost:8181/api/updateEmploy",employ);
  }
  showEmploy() : Observable<any> {
    return this._http.get("http://localhost:8181/api/showEmploy")
  }

  searchEmploy(eno :number) : Observable<any> {
    return this._http.get("http://localhost:8181/api/searchEmploy/"+eno)
  }
}
