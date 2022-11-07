import { Validators } from '@angular/forms';

export const blueprintStringField = {
  name: ['', [Validators.required]],
  type: ['string', [Validators.required]],
  nullable: [false, [Validators.required]],
}
