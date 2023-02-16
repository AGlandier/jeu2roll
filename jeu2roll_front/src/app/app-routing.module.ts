import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateActuComponent } from './create-actu/create-actu.component';
import { CreerPersonnageComponent } from './creer-personnage/creer-personnage.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { PersonnagesComponent } from './personnages/personnages.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterComponent } from './register/register.component';
import { SocialComponent } from './social/social.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'persos', component: PersonnagesComponent},
  {path: 'persos/creerperso', component: CreerPersonnageComponent},
  {path: 'profile', component: ProfileComponent},
  {path: 'createactu', component: CreateActuComponent},
  {path: 'social', component: SocialComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
