import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { DdListesService } from '../services/dd-listes.service';

@Component({
  selector: 'app-creer-personnage',
  templateUrl: './creer-personnage.component.html',
  styleUrls: ['./creer-personnage.component.css']
})
export class CreerPersonnageComponent {

  constructor(private http: HttpClient, private liste: DdListesService) {}

  classes: any;
  races: any;
  historiques: any;
  caracs: any;
  competences: any;
  armes: any;
  armures: any;

  valid1: any;
  valid2: any;
  step1: any;
  step2: any;

  roll: any;
  classeActive: any;
  raceActive: any;  
  classe: any;

  de_vie: any;
  de_vie_amount: any;
  de_vie_mean: any;
  vie: any;

  ngOnInit(): void {
    this.valid1 = false;
    this.valid2 = false;
    this.step1 = true;
    this.step2 = false;
    this.classeActive = []
    this.roll = [0, 0, 0, 0, 0, 0, 0]
    this.classes = this.liste.classes;
    this.races = this.liste.races;
    this.historiques = this.liste.historiques;
    this.caracs = this.liste.caracteristiques;
    
    this.recupComp();
    this.recupArmes();
    this.recupArmures();
  }

  rollCaracs() : void {
    this.roll = [];
    this.http.get('http://localhost:8289/roll/caracs').subscribe({
      next: (data) => {this.roll = data;},
      error: (err) => {console.log(err); }
    })
  }

  recupComp() : void {
    this.http.get('http://localhost:8289/competence').subscribe({
      next: (data) => {this.competences = data;},
      error: (err) => {console.log(err); }
    })
  }

  recupArmes() : void {
    this.http.get('http://localhost:8289/arme').subscribe({
      next: (data) => {this.armes = data;},
      error: (err) => {console.log(err); }
    })
  }

  recupArmures() : void {
    this.http.get('http://localhost:8289/armure').subscribe({
      next: (data) => {this.armures = data;},
      error: (err) => {console.log(err); }
    })
  }

  rollLife() : void {
    this.de_vie = this.classeActive.de_vie;
    const nv = document.getElementById("niveau") as HTMLInputElement | null;
    if (nv != null) {
      this.de_vie_amount = nv.value;
      console.log(nv.value);
    }

    const mean = document.getElementById("mean") as HTMLInputElement | null;
    this.de_vie_mean = mean?.checked;

    this.http.get('http://localhost:8289/roll/life/' + this.de_vie + '/' + this.de_vie_amount + '/' + this.roll[2] + '/' + this.de_vie_mean).subscribe({
      next: (data) => {this.vie = data;},
      error: (err) => {console.log(err); }
  })


  }

  setRaceActive(): void {
    const input = document.getElementById("selectRace") as HTMLInputElement | null;
    if (input != null) {
      this.http.get('http://localhost:8289/race/nom/' + input.value).subscribe({
      next: (data) => {this.raceActive = data;},
      error: (err) => {console.log(err); }
    })
  }
}

  setValidTrue(key: any): void {

    switch (key) {
      case 1:
        this.valid1 = true;
        break;
      case 2:
        this.valid2 = true;
        break;
    
      default:
        break;
    }
  }

  stepChange(key: any): void {

    switch (key) {
      case 1:
        this.step1 = false;
        this.step2 = true;
        break;
      case 2:
        this.step1 = true;
        this.step2 = false;
        break;
    
      default:
        break;
    }
  }

  setClasseActive() {
    const input = document.getElementById("selectClasse") as HTMLInputElement | null;
    if (input != null) {
      this.classe = input.value;
    }
    this.http.get('http://localhost:8289/classe/nom/' + this.classe).subscribe({
      next: (data) => {this.classeActive = data;},
      error: (err) => {console.log(err); }

  })

}

}
