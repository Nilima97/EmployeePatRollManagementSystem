import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BgComponent } from './cc/bg/bg.component';
import { NavbarComponent } from './cc/navbar/navbar.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { FormsModule} from '@angular/forms';
import {ReactiveFormsModule } from '@angular/forms';
import { InvoiceComponent } from './invoice/invoice.component';
import { PasswordresetComponent } from './passwordreset/passwordreset.component';
import { HttpClientModule } from '@angular/common/http';
import { ProductComponent } from './product/product.component';
import { HomeComponent } from './home/home.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { UpdateproductComponent } from './updateproduct/updateproduct.component';
import { UserHomeComponent } from './user-home/user-home.component';
import { UserplistComponent } from './userplist/userplist.component';
import { TakeatourComponent } from './takeatour/takeatour.component';
import { LeaveComponent } from './leave/leave.component';
import { SalaryComponent } from './salary/salary.component';
import { AttendanceComponent } from './attendance/attendance.component';
import { EmployeeAttendanceComponent } from './employee-attendance/employee-attendance.component';
import { EmployeeattendanceComponent } from './employeeattendance/employeeattendance.component';
import { Salary2Component } from './salary2/salary2.component';

import { TimesheetComponent } from './timesheet/timesheet.component';
import { EmployeeComponent } from './employee/employee.component';
import { AdminComponent } from './admin/admin.component';
import { PayhomeComponent } from './payhome/payhome.component';
import { AdminRComponent } from './admin-r/admin-r.component';
import { AdminLComponent } from './admin-l/admin-l.component';
import { EmployeePageComponent } from './employee-page/employee-page.component';
import { UpdateemployeeComponent } from './updateemployee/updateemployee.component';
import { ViewsalaryComponent } from './viewsalary/viewsalary.component';
import { SalComponent } from './sal/sal.component';
// import { ReportComponent } from './reports/report.component';
import { ReportsComponent } from './reports/reports.component';
import { ReportdetailsComponent } from './reportdetails/reportdetails.component';
import { AttendancereportComponent } from './attendancereport/attendancereport.component';
import { LeavereportComponent } from './leavereport/leavereport.component';
import { EmployeeRComponent } from './employee-r/employee-r.component';
import { SalaryslipComponent } from './salaryslip/salaryslip.component';





// import { NgOtpInputModule } from  'ng-otp-input';


@NgModule({
  declarations: [
    AppComponent,
    BgComponent,
    NavbarComponent,
    RegisterComponent,
    LoginComponent,
    InvoiceComponent,
    PasswordresetComponent,
    ProductComponent,
    HomeComponent,
    AddproductComponent,
    ProductlistComponent,
    UpdateproductComponent,
    UserHomeComponent,
    UserplistComponent,
    TakeatourComponent,
    LeaveComponent,
    SalaryComponent,
    AttendanceComponent,
    EmployeeAttendanceComponent,
    EmployeeattendanceComponent,
    Salary2Component,
    // LeavereportComponent,
    TimesheetComponent,
    EmployeeComponent,
    AdminComponent,
    PayhomeComponent,
    AdminRComponent,
    AdminLComponent,
    EmployeePageComponent,
    UpdateemployeeComponent,
    ViewsalaryComponent,
    SalComponent,
    // ReportComponent,
    ReportsComponent,
    ReportdetailsComponent,
    AttendancereportComponent,
    LeavereportComponent,
    EmployeeRComponent,
    SalaryslipComponent,
    
    
   
   
   
   
    
   
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,
    HttpClientModule,ReactiveFormsModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
 
}
