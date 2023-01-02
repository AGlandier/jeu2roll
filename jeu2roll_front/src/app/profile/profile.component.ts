import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { SessionService } from '../services/session.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent {

  user: any;
  admin: any;
  displayAdmin: any;

  constructor(private http: HttpClient, private session: SessionService, private route: Router) {}

  ngOnInit(): void {

    if(!this.session.isActive()) {;
      this.route.navigateByUrl("/login")
    } else {
      this.user = this.session.userActif;
    }

    this.admin = this.user.admin;
    this.displayAdmin = false;
  }

  setAdminTrue(): void {
    this.displayAdmin = true;
  }

  goActu(): void {
    this.route.navigateByUrl("/createactu")
  }

}
