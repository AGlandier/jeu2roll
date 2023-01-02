import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SessionService {

  userActif: any;
  active: boolean = false;
  constructor() { }

  setUserActif(u: any): void {
    this.userActif = u;
  }

  setActiveFalse(): void {
      this.active = false;
    }

  setActiveTrue(): void {
      this.active = true;
    }


  isActive(): boolean {
    return this.active;
  }
}
