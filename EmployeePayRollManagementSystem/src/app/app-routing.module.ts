import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { AdminLComponent } from './admin-l/admin-l.component';
import { AdminRComponent } from './admin-r/admin-r.component';
import { AdminComponent } from './admin/admin.component';
// import { AttendanceListComponent } from './attendance-list/attendance-list.component';
import { AttendanceComponent } from './attendance/attendance.component';
import { AttendancereportComponent } from './attendancereport/attendancereport.component';
import { EmployeeAttendanceComponent } from './employee-attendance/employee-attendance.component';
import { EmployeePageComponent } from './employee-page/employee-page.component';
import { EmployeeRComponent } from './employee-r/employee-r.component';
import { EmployeeComponent } from './employee/employee.component';

import { HomeComponent } from './home/home.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { LeaveComponent } from './leave/leave.component';
import { LeavereportComponent } from './leavereport/leavereport.component';
import { LoginComponent } from './login/login.component';
import { PasswordresetComponent } from './passwordreset/passwordreset.component';
import { PayhomeComponent } from './payhome/payhome.component';
import { ProductComponent } from './product/product.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { RegisterComponent } from './register/register.component';
import { ReportdetailsComponent } from './reportdetails/reportdetails.component';
import { ReportsComponent } from './reports/reports.component';
import { SalComponent } from './sal/sal.component';

import { SalaryComponent } from './salary/salary.component';
import { Salary2Component } from './salary2/salary2.component';
import { SalaryslipComponent } from './salaryslip/salaryslip.component';
import { TakeatourComponent } from './takeatour/takeatour.component';
import { TimesheetComponent } from './timesheet/timesheet.component';
import { UpdateemployeeComponent } from './updateemployee/updateemployee.component';

import { UpdateproductComponent } from './updateproduct/updateproduct.component';
import { UserHomeComponent } from './user-home/user-home.component';
import { UserplistComponent } from './userplist/userplist.component';
import { ViewsalaryComponent } from './viewsalary/viewsalary.component';

const routes: Routes = [
  
  {path:"Invoice",component:InvoiceComponent},
  {path:"Passwordreset",component:PasswordresetComponent},
  {path:"register",component:RegisterComponent},
  {path:"login",component:LoginComponent},
 {path:"Product",component:ProductComponent},
{path:'home',component:HomeComponent},
{path:'addproduct',component:AddproductComponent},
{path:'productlist',component:ProductlistComponent},
{path:'updateproduct/:pid',component:UpdateproductComponent},
{path:'userhome',component:UserHomeComponent},
{path:'userplist',component:UserplistComponent} ,
{path:'leave',component:LeaveComponent},
{path:'salary',component:SalaryComponent},
{path:'attendance',component:AttendanceComponent},
{path:'employeeattendance',component:EmployeeAttendanceComponent},
{path:'salary2',component:Salary2Component},
{path:'timesheet',component:TimesheetComponent},
{path:'takeatour',component:TakeatourComponent} ,
// {path:'attendance-list',component:AttendanceListComponent},
{path:'employee',component:EmployeeComponent} ,
{path:'admin',component:AdminComponent},
{path:'payhome',component:PayhomeComponent},
{path:'adminr',component:AdminRComponent},
{path:'adminl',component:AdminLComponent},
{path:'employeepage',component:EmployeePageComponent},
{path:'updateemployee/:eid',component:UpdateemployeeComponent},
{path:'viewsalary',component:ViewsalaryComponent},
{path:'sal',component:SalComponent},
{path:'employeer',component:EmployeeRComponent},

{path:'salaryslip',component:SalaryslipComponent},

{
  path: 'reports/:id',
  component: ReportdetailsComponent,
  children: [
    { path: 'attendancereport', component: AttendancereportComponent },
    { path: 'leavereport', component: LeavereportComponent },
  ],
},
// {path:'reports',component:ReportsComponent},
// {path:'reportdetails',component:ReportdetailsComponent},
// {path:'attendancereport',component:AttendancereportComponent},
// {path:'leavereport',component:LeavereportComponent},



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
