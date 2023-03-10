import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DdListesService {

  constructor() { }

  classes: string[] = ['Barbare', 'Barde', 'Clerc', 'Druide', 'Ensorceleur', 'Guerrier', 'Magicien', 'Moine',
'Occultiste', 'Paladin', 'Rôdeur', 'Roublard'];

races: string[] = ['Elfe', 'Halfelin', 'Humain', 'Nain', 'Demi-Elfe', 'Demi-Orc', 'Drakéide', 'Gnome', 'Thieffelin'];

historiques: string[] = ['Acolyte', 'Artisan de guilde', 'Artiste', 'Charlatan', 'Criminel', 'Enfant des rues',
'Ermite', 'Héros du peuple', 'Marin', 'Noble', 'Sage', 'Sauvageon', 'Soldat']

caracteristiques: string[] = ['Force', 'Dextérité', 'Constitution', 'Intelligence', 'Sagesse', 'Charisme']

setXp (nb: any) : any {

  switch(nb) { 
    case (1): { 
       return 0;
    }
    case (2): { 
      return 300;
    } 
   case (3): { 
    return 900;
   }
   case (4): { 
    return 2700;
 }
 case (5): { 
  return 6500;
}
case (6): { 
  return 14000;
}
case (7): { 
  return 23000;
}
case (8): { 
  return 34000;
}
case (9): { 
  return 48000;
}
case (10): { 
  return 64000;
}
case (11): { 
  return 85000;
}
case (12): { 
  return 100000;
}
case (13): { 
  return 120000;
}
case (14): { 
  return 140000;
}
case (15): { 
  return 165000;
}
case (16): { 
  return 195000;
}
case (17): { 
  return 225000;
}
case (18): { 
  return 265000;
}
case (19): { 
  return 305000;
}
case (20): { 
  return 355000;
}
}


}
}

