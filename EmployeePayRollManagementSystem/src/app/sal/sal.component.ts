import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SalaryService } from '../salary.service';

@Component({
  selector: 'app-sal',
  templateUrl: './sal.component.html',
  styleUrls: ['./sal.component.css']
})
export class SalComponent implements OnInit {
  @Input()
  salary: any={
   
    empId: '',
    pfAmount:'',
    tranDate:'',
    basicPay:'',
    da:'',
    hra :'',
    tax:'',
    
  }
 
  
  constructor(public sservice:SalaryService,public roter: Router) { }

  ngOnInit(): void {
  }
  addsal() {
    console.log('From sal.comp.ts ' + this.salary);
    this.sservice.addsalary(this.salary).subscribe((data:{}) =>this.roter.navigate(['/viewsalary']));
  }
  
}
