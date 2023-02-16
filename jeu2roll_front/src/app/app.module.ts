import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { formatDate } from '@angular/common';
import { FormatdatePipe } from 'src/pipes/formatDate.pipe';
import { CreerPersonnageComponent } from './creer-personnage/creer-personnage.component';
import { PersonnagesComponent } from './personnages/personnages.component';
import { ProfileComponent } from './profile/profile.component';
import { FormatmdpPipe } from 'src/pipes/formatMdp.pipe';
import { CreateActuComponent } from './create-actu/create-actu.component';
import { SocialComponent } from './social/social.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    FormatdatePipe,
    FormatmdpPipe,
    CreerPersonnageComponent,
    PersonnagesComponent,
    ProfileComponent,
    CreateActuComponent,
    SocialComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  exports: [
    FormatdatePipe,
    FormatmdpPipe
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
