import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, retry, throwError } from 'rxjs';
import { Employee } from './db';

@Injectable({
  providedIn: 'root'
})
export class EmpserviceService {
  private url: string = "http://localhost:8080/EmployeePayrollManage/employee";

  httpOptions = {
        headers: new HttpHeaders({
          'Content-Type': 'application/json',
        }),
      };
  constructor(private http: HttpClient) { }
    
  
  getEmployeesFromService(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.url+'/allemps');
    
  }

    updateEmployee(employee: any): Observable<Employee> {
    console.log(employee);
    return this.http
      .put<Employee>(
        this.url + '/updateemp/{eid}',
        JSON.stringify(employee),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }
  deleteEmpoyee(eid:number):Observable<Employee>{
    console.log(eid + ' from deleteProduct()');
    return this.http
    .delete<Employee>(this.url + '/deleteemp/' + eid, this.httpOptions)
    .pipe(retry(1), catchError(this.handleError));
  }
  
  
  handleError(error: any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    } else {
      errorMessage = `Error Code : ${error.status} \n Error Message : ${error.message} `;
    }

    window.alert(errorMessage);
    return throwError(errorMessage);
  }
    createEmployee(employee: any): Observable<Employee> {
    console.log(employee);
    return this.http
      .post<Employee>(
        this.url + '/cemployee',
        JSON.stringify(employee),
        this.httpOptions
      )
      .pipe(retry(1), catchError(this.handleError));
  }
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

  // updateEmployee(employee: any): Observable<employee> {
  //   console.log(employee);
  //   return this.http
  //     .put<employee>(
  //       this.url + '/updateEmp',
  //       JSON.stringify(employee),
  //       this.httpOptions
  //     )
  //     .pipe(retry(1), catchError(this.handleError));
  // }



