import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EthnicitiesComponent } from './ethnicities.component';

describe('EthnicitiesComponent', () => {
  let component: EthnicitiesComponent;
  let fixture: ComponentFixture<EthnicitiesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EthnicitiesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EthnicitiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
