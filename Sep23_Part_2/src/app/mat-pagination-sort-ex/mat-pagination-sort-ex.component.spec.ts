import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MatPaginationSortExComponent } from './mat-pagination-sort-ex.component';

describe('MatPaginationSortExComponent', () => {
  let component: MatPaginationSortExComponent;
  let fixture: ComponentFixture<MatPaginationSortExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MatPaginationSortExComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MatPaginationSortExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
