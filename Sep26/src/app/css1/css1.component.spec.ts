import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Css1Component } from './css1.component';

describe('Css1Component', () => {
  let component: Css1Component;
  let fixture: ComponentFixture<Css1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Css1Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Css1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
