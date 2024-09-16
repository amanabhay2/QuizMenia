import { TestBed } from '@angular/core/testing';

import { SingleQuestionService } from './singleQuestion.service';

describe('SingleQuestionService', () => {
  let service: SingleQuestionService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SingleQuestionService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
