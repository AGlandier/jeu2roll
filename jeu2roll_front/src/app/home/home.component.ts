import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  constructor(private http: HttpClient) {}

  actus: any;

  ngOnInit(): void {
    this.getActus();
  }

  getActus () {
    this.http.get('http://localhost:8289/actu/all').subscribe({
      next: (data)=> { this.actus = data; 
      console.log(data)},
      error: (err) => { console.log(err); }
  })
}

}
