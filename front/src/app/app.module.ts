import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { ToolbarComponent } from './component/toolbar/toolbar.component';
import { MatIconModule } from '@angular/material/icon';
import { FooterComponent } from './component/footer/footer.component';
import { MatGridListModule } from '@angular/material/grid-list';
import { ButtonsComponent } from './component/buttons/buttons.component';
import { MatButtonModule } from '@angular/material/button';
import { MatListModule } from '@angular/material/list';
import { MatCardModule } from '@angular/material/card';
import { CalculoModule } from './calculo';
      

@NgModule({
  declarations: [
    AppComponent,
    ToolbarComponent,
    FooterComponent,
    ButtonsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatGridListModule,
    MatIconModule,
    MatToolbarModule,
    MatButtonModule,
    MatListModule,
    MatCardModule,
    CalculoModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
