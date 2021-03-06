import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { ${moduleName}Component } from './${moduleFileName}.component';

describe('${moduleName}Component', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        ${moduleName}Component
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(${moduleName}Component);
    const app = fixture.debugElement.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title '${moduleName}'`, () => {
    const fixture = TestBed.createComponent(${moduleName}Component);
    const app = fixture.debugElement.componentInstance;
    expect(app.title).toEqual('${moduleName}');
  });

  it('should render title in a h1 tag', () => {
    const fixture = TestBed.createComponent(${moduleName}Component);
    fixture.detectChanges();
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Welcome to ${moduleName}!');
  });
});
