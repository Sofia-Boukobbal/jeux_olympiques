package testunitaires;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jo.Athlete;
import jo.Entraineur;
import jo.JeuxOlympiques;

class TestAppliJO {

	@Test
	void testForCover() {
		JeuxOlympiques jeux = new JeuxOlympiques();

		Athlete usain = new Athlete("Usain", "Bolt", "Jamaïque", "Athlétisme", 8);
		Athlete leon = new Athlete("Léon", "Marchand", "France", "Natation", 4);
		Athlete florent = new Athlete("Florent", "Manaudou", "France", "Natation", 1);

		Entraineur glen = new Entraineur("Glen", "Mills", "USA", "Athlétisme");
		Entraineur bob = new Entraineur("Bob", "Bowman", "USA", "Natation");
		jeux.ajouterParticipant(usain);
		jeux.ajouterParticipant(leon);
		jeux.ajouterParticipant(florent);
		jeux.ajouterParticipant(glen);
		jeux.ajouterParticipant(bob);
		jeux.associerEntraineurAAthlete(usain, glen);  
		jeux.associerEntraineurAAthlete(leon, glen);   
		jeux.associerEntraineurAAthlete(florent, bob);
		fail("Not yet implemented");
		
		jeux.afficherTousLesParticipants();
		jeux.supprimerParticipant(bob);
	}

}
