import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SalaryService } from '../salary.service';
import { UserService } from '../user.service';

@Component({
  selector: 'app-salary',
  templateUrl: './salary.component.html',
  styleUrls: ['./salary.component.css']
})
export class SalaryComponent implements OnInit {

  public salary = [ ] as any;

    @Input()
  registerDetails: any={
    EmployeeID: '',
    Month: '',
    Amount: '',
   
   
    };
  
  submitted =false;
  
  
  
  
  constructor( public uservice:UserService, public sservice:SalaryService,public roter: Router) {}
  
  onSubmit(){
  this.submitted =true;
  alert('User data are validated successfully');
  }
  ngOnInit(): void {}
  
  
  
  
  add(){
    if(this.registerDetails.typeofcatagory=="Designer")
    {
      this.adda()
    }
    else if(this.registerDetails.typeofcatagory=="Developer")
    {
      this.addb()
    }
    else{
      this.addc()
    }
    
  }
  adda() {
    console.log('From cust.comp.ts ' + this.registerDetails);
    this.uservice.addcust(this.registerDetails).subscribe((data:{}) =>this.roter.navigate(['/login']));
  }
  
  addb() {
    console.log('From supl.comp.ts ' + this.registerDetails);
    this.uservice.addsupl(this.registerDetails).subscribe((data:{}) =>this.roter.navigate(['/login']));
  }
  addc() {
    console.log('From supl.comp.ts ' + this.salary);
    this.uservice.addsupl(this.registerDetails).subscribe((data:{}) =>this.roter.navigate(['/login']));
  }
  
  
  
  addsal() {
    console.log('From cust.comp.ts ' + this.salary);
    this.sservice.addsalary(this.salary).subscribe((data:{}) =>this.roter.navigate(['/viewsalary']));
  }
  
  }
  
  
  
  
  
  

