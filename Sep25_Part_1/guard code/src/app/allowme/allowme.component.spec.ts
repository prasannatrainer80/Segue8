import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllowmeComponent } from './allowme.component';

describe('AllowmeComponent', () => {
  let component: AllowmeComponent;
  let fixture: ComponentFixture<AllowmeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AllowmeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllowmeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
