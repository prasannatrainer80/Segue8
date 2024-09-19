import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployInsertComponent } from './employ-insert.component';

describe('EmployInsertComponent', () => {
  let component: EmployInsertComponent;
  let fixture: ComponentFixture<EmployInsertComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EmployInsertComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployInsertComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
