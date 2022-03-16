import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmpserviceService } from '../empservice.service';

@Component({
  selector: 'app-updateemployee',
  templateUrl: './updateemployee.component.html',
  styleUrls: ['./updateemployee.component.css']
})
export class UpdateemployeeComponent implements OnInit {
  @Input()
  employees: any={
    email:'',
    role:'',
    addr:'',
    phone:''
  }
  constructor(private eservice:EmpserviceService, private router: Router) { }

  ngOnInit(): void {
  }
updateEmp() {
      console.log(' Product Data ----->' + this.employees);
      this.eservice
        . updateEmployee(this.employees)
        .subscribe((data: {}) => this.router.navigate(['/employeepage']));
    }
}
