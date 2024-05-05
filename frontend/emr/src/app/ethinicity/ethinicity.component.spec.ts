import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EthinicityComponent } from './ethinicity.component';

describe('EthinicityComponent', () => {
  let component: EthinicityComponent;
  let fixture: ComponentFixture<EthinicityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EthinicityComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EthinicityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
