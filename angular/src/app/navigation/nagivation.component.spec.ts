import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StripehivNavigationComponent } from './stripehiv-navigation.component';

describe('StripehivNavigationComponent', () => {
  let component: StripehivNavigationComponent;
  let fixture: ComponentFixture<StripehivNavigationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StripehivNavigationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StripehivNavigationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
