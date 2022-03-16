import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-salary2',
  templateUrl: './salary2.component.html',
  styleUrls: ['./salary2.component.css']
})
export class Salary2Component implements OnInit {

  @Input()
registerDetails: any={
  name: '',
  email: '',
  password: '',
  confirmp: '',
  contact: '',
  gender: '',
  typeofuser:'',
 
  };

submitted =false;




constructor( public uservice:UserService, public roter: Router) {}

onSubmit(){
this.submitted =true;
alert('User data are validated successfully');
}
ngOnInit(): void {}




add(){
  if(this.registerDetails.typeofcatagory=="Designer")
  {
    this.addc()
  }
  else{
    this.adds()
  }
}
addc() {
  console.log('From cust.comp.ts ' + this.registerDetails);
  this.uservice.addcust(this.registerDetails).subscribe((data:{}) =>this.roter.navigate(['/login']));
}

adds() {
  console.log('From supl.comp.ts ' + this.registerDetails);
  this.uservice.addsupl(this.registerDetails).subscribe((data:{}) =>this.roter.navigate(['/login']));
}



}





