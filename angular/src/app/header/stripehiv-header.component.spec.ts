import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StripehivHeaderComponent } from './stripehiv-header.component';

describe('StripehivHeaderComponent', () => {
  let component: StripehivHeaderComponent;
  let fixture: ComponentFixture<StripehivHeaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StripehivHeaderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StripehivHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
