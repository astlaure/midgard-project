import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BlueprintsRoutingModule } from './blueprints-routing.module';
import { BlueprintListComponent } from './routes/blueprint-list/blueprint-list.component';
import { BlueprintCreateComponent } from './routes/blueprint-create/blueprint-create.component';
import { ReactiveFormsModule } from '@angular/forms';
import { BlueprintStringComponent } from './components/blueprint-string/blueprint-string.component';
import { BlueprintIntegerComponent } from './components/blueprint-integer/blueprint-integer.component';


@NgModule({
  declarations: [
    BlueprintListComponent,
    BlueprintCreateComponent,
    BlueprintStringComponent,
    BlueprintIntegerComponent
  ],
  imports: [
    CommonModule,
    BlueprintsRoutingModule,
    ReactiveFormsModule,
  ]
})
export class BlueprintsModule { }
