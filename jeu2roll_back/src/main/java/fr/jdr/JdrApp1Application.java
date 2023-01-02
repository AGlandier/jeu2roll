package fr.jdr;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.jdr.entities.Actu;
import fr.jdr.entities.Fichedd;
import fr.jdr.entities.User;
import fr.jdr.repository.ActuRepository;
import fr.jdr.repository.ClasseRepository;
import fr.jdr.repository.CompetenceRepository;
import fr.jdr.repository.FicheRepository;
import fr.jdr.repository.RaceRepository;
import fr.jdr.repository.UserRepository;
import fr.jdr.tools.Data_Classes;
import fr.jdr.tools.generalTools;


@SpringBootApplication
public class JdrApp1Application implements CommandLineRunner{
	
	@Autowired
	private UserRepository uRepos;
	@Autowired
	private FicheRepository fRepos;
	@Autowired
	private ActuRepository aRepos;
	@Autowired
	private ClasseRepository cRepos;
	@Autowired
	private RaceRepository rRepos;
	@Autowired
	private CompetenceRepository clRepos;
	
	public static void main(String[] args) {
		SpringApplication.run(JdrApp1Application.class, args);
		System.out.println("Lancement terminé");
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		generalTools tool = new generalTools();
		Data_Classes data = new Data_Classes(cRepos, rRepos, clRepos);
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy"); 
		Date date = df.parse("02-07-1998");

		User u1 = new User(null, false, "Default", "123", null, null, null);
		User u2 = new User(null, true, "MasterDungeon42", "jeu2roll", "master.dungeon@gmail.com", date, "https://cdn.shopify.com/s/files/1/0287/6738/7780/products/PORTRAITOLLOWORANGE6.png?v=1597638270");
		uRepos.save(u1);
		uRepos.save(u2);
		
		Fichedd f1 = new Fichedd();
		f1.setUser(u2);
		f1.setNom_perso("Quillan");
		f1.setRace("Demi-elfe");
		f1.setClasse("Rodeur");
		f1.setAlignement("NN");
		f1.setCaracs();
		f1.setNiveau(1);
		f1.setHistorique("Sauvageon");
		f1.setHistoire("En voulant sauver son père de la pyramide des ombres, Quillan s'est retrouvé bloqué entre son plan et celui des démons."
				+ " Il erre désormais telle une ombre dans la vallée des rois à la recherche de qui pourra rompre le sceau qui le retient prisonnier.");
		f1.setIllu("https://i.pinimg.com/564x/19/b9/6f/19b96f0990670d8eb26113418056fc66.jpg");
		f1.setVisible(true);
		f1.setDate(tool.GetTodayDate());
		fRepos.save(f1);
		
		Fichedd f2 = new Fichedd();
		f2.setUser(u2);
		f2.setNom_perso("Ygnor");
		f2.setRace("Nain");
		f2.setClasse("Barbare");
		f2.setAlignement("CB");
		f2.setCaracs();
		f2.setNiveau(1);
		f2.setHistorique("Soldat");
		f2.setHistoire("Ygnor en a connu des"
				+ " champs de bataille. Mais pour son ultime bataille, il cherche quelque chose de plus grand. Tenter de renverser un roi, ça pourrait ne pas être mal non ?");
		f2.setIllu("https://jolstatic.fr/www/captures/2534/6/130216.jpg");
		f2.setVisible(true);
		f2.setDate(tool.GetTodayDate());
		fRepos.save(f2);
		
		Actu a1 = new Actu(null, "Mise en ligne du site !", "Aujourd'hui, c'est l'ouverture du site Jeu2Roll ! Merci de votre soutien !", 
				"https://www.numerama.com/wp-content/uploads/2020/03/role-playing-game-2536016_1920.jpg", tool.GetTodayDate(), u2);
		aRepos.save(a1);
		
		data.creata_classes_data();
		data.dataRaces();
		data.dataCompetences();
		*/
		
	}
}
