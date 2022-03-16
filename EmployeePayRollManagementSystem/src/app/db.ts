export interface Product{
    pid:any;
    Products: any  ;
    Price: any;
    Quantity:any;
    Total: any;
}

export interface User{
    id:any;
    name:any;
    email:any;
    password:any;
    contact:any;
    gender:any;
}


export interface Employee{
    eid:any;
    ename: any,
    email: string,
    doj: any,
    role: string,
   dob: any,
   addr: string,
  Phone: number,
  pan: any,
   password:any,
}
export interface Salary{
    salId:any;
    empId:any;
    pfAmount:any;
    tranDate:any;
    basicPay:any;
    da:any;
    hra :any;
    grossSalary:any;
    tax:any;
    deduction:any;
    netPay:any;
}
export interface attdetail{
    aid:number;
    employeeid:string;
    adate:String;
    logon:String;
    logoff:String;
}