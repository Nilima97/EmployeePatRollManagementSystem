import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-admin-r',
  templateUrl: './admin-r.component.html',
  styleUrls: ['./admin-r.component.css']
})
export class AdminRComponent implements OnInit {
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
  constructor(public uservice:UserService, public roter: Router) { }
  onSubmit(){
    this.submitted =true;
    alert('User dates are validated successfully');
  }
  ngOnInit(): void {
  }
  onLogin(loginForm: NgForm) {
    console.log(loginForm.value);
    const user = this.authService.authUser1(loginForm.value);
    console.log(user);

    if (user) {
      localStorage.setItem('user', JSON.stringify(user));
      console.log('Registeration Successfully');
      alert("Welcome back \nClick ok to proceed!");
      this.roter.navigate(['home'])

    }
    else {
      console.log('Registration not Successfully');
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
}
