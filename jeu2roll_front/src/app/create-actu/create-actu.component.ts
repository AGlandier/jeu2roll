import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { SessionService } from '../services/session.service';

@Component({
  selector: 'app-create-actu',
  templateUrl: './create-actu.component.html',
  styleUrls: ['./create-actu.component.css']
})
export class CreateActuComponent {

  imgShow: any;
  titre: any;
  contenu: any;
  previsu: any;
  user: any;
  nom: any;
  date: any;

  constructor(private session: SessionService, private route: Router, private http: HttpClient) {}

  ngOnInit(): void {
    //if(!this.session.isActive()) {;
      //this.route.navigateByUrl("/login")
    //} else {
      this.user = this.session.userActif;
    //}
    this.nom = this.user.login
    this.getTodaysDate();
    this.imgShow = "https://www.numerama.com/wp-content/uploads/2020/03/role-playing-game-2536016_1920.jpg"
    this.previsu = false;
    
  }

  setImg(): void {
    const image = document.getElementById("image") as HTMLInputElement | null;
    this.imgShow = image?.value;
  }

  showPrevisu(): void {
    const image = document.getElementById("image") as HTMLInputElement | null;
    const t = document.getElementById("titre") as HTMLInputElement | null;
    const c = document.getElementById("contenu") as HTMLInputElement | null;

    this.imgShow = image?.value;
    this.titre = t?.value;
    this.contenu = c?.value;
    
    this.previsu = true;
  }

  getTodaysDate(): void {
    this.http.get('http://localhost:8289/date').subscribe({
      next: (data) => {this.date = data;},
      error: (err) => {console.log(err); }
    })
  }

  createActu(val: any): void {
    val.auteur = this.user;
    this.http.post("http://localhost:8289/actu", val).subscribe({
      next: (data) => {console.log(data);
        this.route.navigateByUrl('')
      },
      error: (err) => {console.log(err);
      }
    });
  }

}
