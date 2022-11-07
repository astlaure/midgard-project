import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlueprintIntegerComponent } from './blueprint-integer.component';

describe('BlueprintIntegerComponent', () => {
  let component: BlueprintIntegerComponent;
  let fixture: ComponentFixture<BlueprintIntegerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BlueprintIntegerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BlueprintIntegerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
