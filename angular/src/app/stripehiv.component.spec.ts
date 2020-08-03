import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { StripehivComponent } from './stripehiv.component';

describe('${moduleName}Component', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        StripehivComponent
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(StripehivComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'Stripehiv'`, () => {
    const fixture = TestBed.createComponent(StripehivComponent);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('Stripehiv');
  });

  it('should render title in a h1 tag', () => {
    const fixture = TestBed.createComponent(StripehivComponent);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to Stripehiv!');
  });
});
