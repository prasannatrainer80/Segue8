import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MatRepeatComponent } from './mat-repeat.component';

describe('MatRepeatComponent', () => {
  let component: MatRepeatComponent;
  let fixture: ComponentFixture<MatRepeatComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MatRepeatComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MatRepeatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
