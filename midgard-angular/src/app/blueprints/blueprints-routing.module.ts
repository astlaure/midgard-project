import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BlueprintListComponent } from './routes/blueprint-list/blueprint-list.component';
import { BlueprintCreateComponent } from './routes/blueprint-create/blueprint-create.component';

const routes: Routes = [
  { path: 'blueprints', component: BlueprintListComponent },
  { path: 'blueprints/create', component: BlueprintCreateComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BlueprintsRoutingModule { }
