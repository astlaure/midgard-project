import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { APP_BASE_HREF } from '@angular/common';
import { BlueprintsModule } from './blueprints/blueprints.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BlueprintsModule,
  ],
  providers: [
    {
      provide: APP_BASE_HREF,
      useValue: process.env['NODE_ENV'] === 'production' ? '/admin' : '',
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
