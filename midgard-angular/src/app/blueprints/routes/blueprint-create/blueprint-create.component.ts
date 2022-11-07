import { Component } from '@angular/core';
import { FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { blueprintStringField } from '../../schemas/blueprint-string-field';
import { blueprintIntegerField } from '../../schemas/blueprint-integer-field';

@Component({
  selector: 'app-blueprint-create',
  templateUrl: './blueprint-create.component.html',
  styleUrls: ['./blueprint-create.component.scss']
})
export class BlueprintCreateComponent {
  blueprintForm = this.formBuilder.group({
    name: ['', [Validators.required]],
    status: ['DRAFT', [Validators.required]],
    secured: [false, [Validators.required]],
    fields: this.formBuilder.array([]),
  });

  constructor(private formBuilder: FormBuilder) { }

  get fields() {
    return this.blueprintForm.get('fields') as FormArray<FormGroup>;
  }

  onSubmit() {
    console.log(this.blueprintForm.value);
  }

  addString() {
    this.fields.push(this.formBuilder.group(blueprintStringField));
  }

  addInteger() {
    this.fields.push(this.formBuilder.group(blueprintIntegerField));
  }
}
