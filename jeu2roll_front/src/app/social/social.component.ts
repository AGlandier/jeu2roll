import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { SessionService } from '../services/session.service';

@Component({
  selector: 'app-social',
  templateUrl: './social.component.html',
  styleUrls: ['./social.component.css']
})
export class SocialComponent {

  user: any;
  amis: any;
  pending: any;

  constructor(private http: HttpClient, private session: SessionService, private route: Router) {}

  ngOnInit(): void {
    //if(!this.session.isActive()) {;
    //  this.route.navigateByUrl("/login")
    //} else {
      this.user = this.session.userActif;
   // }
    this.amis = this.getAmis();
    this.pending = this.getPending();
  }

  getAmis () {
    this.http.get('http://localhost:8289/friend/accept/' + this.user.id).subscribe({
      next: (data)=> { this.amis = data; 
      console.log(data)},
      error: (err) => { console.log(err); }
  })
}

getPending () {
  this.http.get('http://localhost:8289/friend/pending/' + this.user.id).subscribe({
    next: (data)=> { this.amis = data; 
    console.log(data)},
    error: (err) => { console.log(err); }
})
}

}
