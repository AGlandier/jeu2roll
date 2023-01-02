import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { SessionService } from '../services/session.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent{

  isConnected: any;

  constructor(private http: HttpClient, private route: Router, private session: SessionService,) {}
  ngOnInit(): void {
    this.isConnected = this.session.isActive();
  }

  register (val: any) {
    this.http.post("http://localhost:8289/user/register", val).subscribe({
      next: (data) => {console.log(data);
        this.route.navigateByUrl('login')
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
