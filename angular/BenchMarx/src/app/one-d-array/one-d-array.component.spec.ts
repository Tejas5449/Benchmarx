import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OneDArrayComponent } from './one-d-array.component';

describe('OneDArrayComponent', () => {
  let component: OneDArrayComponent;
  let fixture: ComponentFixture<OneDArrayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OneDArrayComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OneDArrayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
