import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SwitchEx1Component } from './switch-ex1.component';

describe('SwitchEx1Component', () => {
  let component: SwitchEx1Component;
  let fixture: ComponentFixture<SwitchEx1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SwitchEx1Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SwitchEx1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
