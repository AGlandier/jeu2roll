import { Component } from '@angular/core';
import { SessionService } from './services/session.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'jdr_app';

  active: any;

  constructor(private session: SessionService) {}

  ngOnInit(): void {
    this.active = this.session.isActive();
  }
}
