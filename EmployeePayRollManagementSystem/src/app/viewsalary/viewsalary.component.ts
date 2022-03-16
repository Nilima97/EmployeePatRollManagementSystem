import { Component, OnInit } from '@angular/core';
import { SalaryService } from '../salary.service';

@Component({
  selector: 'app-viewsalary',
  templateUrl: './viewsalary.component.html',
  styleUrls: ['./viewsalary.component.css']
})
export class ViewsalaryComponent implements OnInit {
  public salary = [ ] as any;
  constructor(private salservice:SalaryService) { }

  ngOnInit(): void {
    this.salservice
      .getSalaryFromService()
      .subscribe((data: any) => (this.salary =data ));
  }

}
