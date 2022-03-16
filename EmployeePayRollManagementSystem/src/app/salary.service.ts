import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Salary } from './db';

@Injectable({
  providedIn: 'root'
})
export class SalaryService {
  private url: string = "http://localhost:8080/EmployeePayrollManage/s";

  httpOptions = {
        headers: new HttpHeaders({
          'Content-Type': 'application/json',
        }),
      };
  constructor(private http: HttpClient) { }
  
  
  addsalary(sal:any):Observable<Salary>{
    console.log(sal);
    return this.http
    .post<Salary>(
      this.url + '/createsal',
      JSON.stringify(sal),
      this.httpOptions
    )
      }
//   createEmployee(employee: any): Observable<employee> {
//     console.log(employee);
//     return this.http
//       .post<employee>(
//         this.url + '/createEmp',
//         JSON.stringify(employee),
//         this.httpOptions
//       )
//       .pipe(retry(1), catchError(this.handleError));
//   }
  getSalaryFromService(): Observable<Salary[]> {
    return this.http.get<Salary[]>(this.url+'/listsalary');
    
  }

}
