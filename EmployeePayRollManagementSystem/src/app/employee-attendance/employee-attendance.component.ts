import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AttdetailService } from '../attdetail.service';

@Component({
  selector: 'app-employee-attendance',
  templateUrl: './employee-attendance.component.html',
  styleUrls: ['./employee-attendance.component.css']
})
export class EmployeeAttendanceComponent implements OnInit {
  @Input()
  attDetails: any = {
    employeeid: '',
    adate: '',
    logon: '',
    logoff: '',
  };
  submitted = false;

  

  constructor(private service: AttdetailService, public router: Router) { }
  
 
  ngOnInit(): void {
    
  }
  onSubmit() {
    this.submitted = true;
    alert('attdetails are Added successfully!');
  }

  addAttDetail() {
    console.log('From attdetail.comp.ts ' + this.attDetails);
    this.service.createAttDetail(this.attDetails).subscribe((data: {}) => this.router.navigate(['/reports/1/attendancereport']));
  }
}

