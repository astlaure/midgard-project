import { Validators } from '@angular/forms';

export const blueprintIntegerField = {
  name: ['', [Validators.required]],
  type: ['integer', [Validators.required]],
  nullable: [true, [Validators.required]],
  minimum: [null, []],
}
