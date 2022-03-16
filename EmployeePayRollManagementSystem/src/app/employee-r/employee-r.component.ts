import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmpserviceService } from '../empservice.service';

@Component({
  selector: 'app-employee-r',
  templateUrl: './employee-r.component.html',
  styleUrls: ['./employee-r.component.css']
})
export class EmployeeRComponent implements OnInit {

  @Input()
  registerDetails: any = {
    ename: '',
    email:'',
    doj:'',
    role: '',
    dob:'',
    addr: '',
    phone: '',
    pan: '',
    
};

  submitted = false;
  
  


  constructor(private service: EmpserviceService, public router: Router) { }

  ngOnInit(): void {
  }
  onSubmit() {
    this.submitted = true;
    alert('Employee datas are validated successfully!');
  }

  addEmployee() {
    console.log('From emp.comp.ts ' + this.registerDetails);
    this.service.createEmployee(this.registerDetails).subscribe((data: {}) => this.router.navigate(['/employeepage']));
  }


}
