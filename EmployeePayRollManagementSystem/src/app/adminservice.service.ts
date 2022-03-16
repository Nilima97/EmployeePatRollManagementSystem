import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminserviceService {
  
  constructor() { }
  authUser(user:any){
    let UserArray=[{email:'subhedarnilima98@gmail.com',password:'Admin@123'}];
    return UserArray.find((p:{email: any; password:any;}) => p.email===user.email && p.password === user.password);
  }
}
