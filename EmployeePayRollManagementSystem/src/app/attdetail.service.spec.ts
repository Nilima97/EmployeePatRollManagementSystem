import { TestBed } from '@angular/core/testing';

import { AttdetailService } from './attdetail.service';

describe('AttdetailService', () => {
  let service: AttdetailService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AttdetailService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
