import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AdminserviceService } from '../adminservice.service';

@Component({
  selector: 'app-admin-l',
  templateUrl: './admin-l.component.html',
  styleUrls: ['./admin-l.component.css']
})
export class AdminLComponent implements OnInit {
  @Input()
  loginsForm: any = {
    email: '',
    password: '',
  };
  constructor(private admins:AdminserviceService ,private router: Router) { }

  ngOnInit(): void {
  }
  onLogin(loginForm: NgForm) {
    console.log(loginForm.value);
    const user = this.admins.authUser(loginForm.value);
    console.log(user);

    if (user) {
      localStorage.setItem('user', JSON.stringify(user));
      console.log('Login Successfully');
      alert("Welcome back \nClick ok to proceed!");
      this.router.navigate(['payhome'])

    }
    else {
      console.log('Login not Successfully');
      alert("User not found :(\nTry again!");
      loginForm.reset();
    }
  }

}
