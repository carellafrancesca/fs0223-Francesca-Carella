import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FirstcomponentComponent } from './firstcomponent.component';

describe('FirstcomponentComponent', () => {
  let component: FirstcomponentComponent;
  let fixture: ComponentFixture<FirstcomponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FirstcomponentComponent]
    });
    fixture = TestBed.createComponent(FirstcomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
