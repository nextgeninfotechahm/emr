import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EthinicityEditComponent } from './ethinicity-edit.component';

describe('EthinicityEditComponent', () => {
  let component: EthinicityEditComponent;
  let fixture: ComponentFixture<EthinicityEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EthinicityEditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EthinicityEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
