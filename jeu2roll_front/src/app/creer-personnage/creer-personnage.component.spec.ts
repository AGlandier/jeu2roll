import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreerPersonnageComponent } from './creer-personnage.component';

describe('CreerPersonnageComponent', () => {
  let component: CreerPersonnageComponent;
  let fixture: ComponentFixture<CreerPersonnageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreerPersonnageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreerPersonnageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
