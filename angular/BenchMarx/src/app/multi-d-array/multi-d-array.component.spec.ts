import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MultiDArrayComponent } from './multi-d-array.component';

describe('MultiDArrayComponent', () => {
  let component: MultiDArrayComponent;
  let fixture: ComponentFixture<MultiDArrayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MultiDArrayComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MultiDArrayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
