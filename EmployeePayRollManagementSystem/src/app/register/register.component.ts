import { Component, Input, OnInit } from '@angular/core';
import { FormControl, FormGroup, NgForm } from '@angular/forms';
// import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthorService } from '../author.service';
import { EmpserviceService } from '../empservice.service';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

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
  authService: any;
 
 

  
constructor( public uservice:UserService,public empservice:EmpserviceService, public roter: Router) {}

onSubmit(){
  this.submitted =true;
  alert('User dates are validated successfully');
}
  ngOnInit(): void {}
  
  onRegister(loginForm: NgForm) {
    console.log(loginForm.value);
    const user = this.authService.authUser(loginForm.value);
    console.log(user);

    if (user) {
      localStorage.setItem('user', JSON.stringify(user));
      console.log('Login Successfully');
      alert("Welcome back \nClick ok to proceed!");
      this.roter.navigate(['home'])

    }
    else {
      console.log('Login not Successfully');
      alert("User not found :(\nTry again!");
      loginForm.reset();
    }
  }

 

  add(){
    if(this.registerDetails.typeofuser=="Customer")
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
  addEmployee() {
    console.log('From emp.comp.ts ' + this.registerDetails);
    this.empservice.createEmployee(this.registerDetails).subscribe((data: {}) => this.roter.navigate(['/login']));
  }
  

}





