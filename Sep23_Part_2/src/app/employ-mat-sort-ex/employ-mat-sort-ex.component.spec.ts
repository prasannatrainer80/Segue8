import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployMatSortExComponent } from './employ-mat-sort-ex.component';

describe('EmployMatSortExComponent', () => {
  let component: EmployMatSortExComponent;
  let fixture: ComponentFixture<EmployMatSortExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmployMatSortExComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployMatSortExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
