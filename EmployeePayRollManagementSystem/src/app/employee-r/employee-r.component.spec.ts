import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeRComponent } from './employee-r.component';

describe('EmployeeRComponent', () => {
  let component: EmployeeRComponent;
  let fixture: ComponentFixture<EmployeeRComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeRComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeRComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
