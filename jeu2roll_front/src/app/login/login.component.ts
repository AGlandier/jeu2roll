import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AppComponent } from '../app.component';
import { SessionService } from '../services/session.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  isBadLog = false;
  isConnected: any;

  constructor(private http: HttpClient, private session: SessionService, private route: Router) {}
  ngOnInit(): void {
    this.isConnected = this.session.isActive();
  }
  user: any;

  login (val: any) {
    this.http.post("http://localhost:8289/user/login", val).subscribe({
      next: (data) => {console.log(data);
        if (data == null) {
          this.isBadLog = true;
        } else {
          this.session.setUserActif(data);
          this.session.setActiveTrue();
          this.route.navigateByUrl("")
        }
      },
      error: (err) => {console.log(err);

      }
    });
  }

  logout() {
    this.session.setUserActif(null);
    this.session.setActiveFalse();
    this.isConnected = this.session.isActive();
  }
}
