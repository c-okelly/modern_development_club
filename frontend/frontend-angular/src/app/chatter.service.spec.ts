import { TestBed, inject } from '@angular/core/testing';

import { ChatterService } from './chatter.service';

describe('ChatterService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ChatterService]
    });
  });

  it('should be created', inject([ChatterService], (service: ChatterService) => {
    expect(service).toBeTruthy();
  }));
});
