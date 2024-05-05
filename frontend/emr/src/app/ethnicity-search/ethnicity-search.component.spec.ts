import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EthnicitySearchComponent } from './ethnicity-search.component';

describe('EthnicitySearchComponent', () => {
  let component: EthnicitySearchComponent;
  let fixture: ComponentFixture<EthnicitySearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EthnicitySearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EthnicitySearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
