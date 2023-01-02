# Jeu2roll - An RPG managing webapp

## The project

### Details
  Jeu2roll is a web application developped to train the skills I learned during my formation. It's an rpg managing app in French language
based on Dungeons&Dragons 5th rules. It contains standard web application features (Login/logout, edit profile etc.) and more specific stuff,
such as character creation (following the official rules of the game).

### Technologies
- Back-end (RestAPI) : Java Spring
- Database : MySQL
- Front-end : Angular framework
- Design : Bootstrap 5

## Screenshots
<img src="https://github.com/AGlandier/jeu2roll/blob/master/documentation/images/home.PNG" width="500"/> <img src="https://github.com/AGlandier/jeu2roll/blob/master/documentation/images/profil.PNG" width="500"/>
<img src="https://github.com/AGlandier/jeu2roll/blob/master/documentation/images/personnages.PNG" width="500"/> <img src="https://github.com/AGlandier/jeu2roll/blob/master/documentation/images/creer_personnage.PNG" width="500"/>
<img src="https://github.com/AGlandier/jeu2roll/blob/master/documentation/images/creer_actualite.PNG" width="500"/>

## Install and run the project
  Since the project works only locally, there's a few manipulation to do before running it.
  
  1. You need [Angular](https://angular.io/guide/setup-local) installed before starting with the app
  2. Set up the database : create a local MySQL database (with XAMPP for example) and execute this request : `CREATE DATABASE appjdr;`
  3. Open "jeu2roll_back" folder as a new java app in your IDE and run it (as Java app OR Springboot app)
  4. Open "jeu2roll_front" with a command prompt and run this command : `ng serve` (it will work unless you don't have Angular correctly installed, in this case, go back to step 1)
  5. Open the app in the browser of your choice ! (http://localhost:4200/)

## Improvements expected
  This project is a WIP, the following feature may be added in the future :
  - Post creation for admin users ✅
  
  - Friendship and groups creation
  - Sorting the lists (News, characters ...)
  - Language selection
  - Scenarii and maps imports
  - Dynamic dice roller
  - JS alignment selector for character creation
  - Room creation to view maps/dicerolls while playing