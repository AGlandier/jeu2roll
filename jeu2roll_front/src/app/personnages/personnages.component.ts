import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-personnages',
  templateUrl: './personnages.component.html',
  styleUrls: ['./personnages.component.css']
})
export class PersonnagesComponent {

  constructor(private http: HttpClient) {}

  persos: any;

  ngOnInit(): void {
    this.getPersos();
  }

  getPersos () {
    this.http.get('http://localhost:8289/fiche/all/visible').subscribe({
      next: (data) => {this.persos = data;},
      error: (err) => {console.log(err); }
    })
  }

}
