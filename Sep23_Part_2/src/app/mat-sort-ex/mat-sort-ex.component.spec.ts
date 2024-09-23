import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MatSortExComponent } from './mat-sort-ex.component';

describe('MatSortExComponent', () => {
  let component: MatSortExComponent;
  let fixture: ComponentFixture<MatSortExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MatSortExComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MatSortExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
