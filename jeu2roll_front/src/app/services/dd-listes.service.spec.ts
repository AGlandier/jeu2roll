import { TestBed } from '@angular/core/testing';

import { DdListesService } from './dd-listes.service';

describe('DdListesService', () => {
  let service: DdListesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DdListesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
