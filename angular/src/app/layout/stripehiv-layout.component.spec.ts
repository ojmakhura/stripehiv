import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StripehivLayoutComponent } from './stripehiv-layout.component';

describe('StripehivLayoutComponent', () => {
  let component: StripehivLayoutComponent;
  let fixture: ComponentFixture<StripehivLayoutComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StripehivLayoutComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StripehivLayoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
