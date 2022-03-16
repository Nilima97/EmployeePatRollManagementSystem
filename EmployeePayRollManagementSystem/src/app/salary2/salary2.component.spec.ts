import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Salary2Component } from './salary2.component';

describe('Salary2Component', () => {
  let component: Salary2Component;
  let fixture: ComponentFixture<Salary2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Salary2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Salary2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
