import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateActuComponent } from './create-actu.component';

describe('CreateActuComponent', () => {
  let component: CreateActuComponent;
  let fixture: ComponentFixture<CreateActuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateActuComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateActuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
