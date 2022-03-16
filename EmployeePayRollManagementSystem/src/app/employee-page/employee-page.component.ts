import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../db';
import { EmpserviceService } from '../empservice.service';

@Component({
  selector: 'app-employee-page',
  templateUrl: './employee-page.component.html',
  styleUrls: ['./employee-page.component.css']
})
export class EmployeePageComponent implements OnInit {
  public employees = [ ] as any;
  
  
  getEmployeesFromService: any;
  
  
  constructor(private eservice:EmpserviceService, private router: Router) { }
  
  
  public selectedId: number = 0;
    ngOnInit(): void {
      this.eservice
        .getEmployeesFromService()
        .subscribe((data: any) => (this.employees =data ));
    }
    
   
    onDelete(emp:Employee){
      this.selectedId =emp.eid;
      if (window.confirm('Are you sure , you want to delete?')) {
            this.eservice
              .deleteEmpoyee(this.selectedId)
              .subscribe((data: {}) => this.router.navigate(['/employeepage']));
          }
        }
}



