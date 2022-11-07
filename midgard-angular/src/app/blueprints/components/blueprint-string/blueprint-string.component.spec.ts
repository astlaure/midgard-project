import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlueprintStringComponent } from './blueprint-string.component';

describe('BlueprintStringComponent', () => {
  let component: BlueprintStringComponent;
  let fixture: ComponentFixture<BlueprintStringComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BlueprintStringComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BlueprintStringComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
