package jo;

public class AppliJeuxOlympiques {
	public static void main(String[] args) {
		JeuxOlympiques jeux = new JeuxOlympiques();

		Athlete usain = new Athlete("Usain", "Bolt", "Jamaïque", "Athlétisme", 8);
		Athlete leon = new Athlete("Léon", "Marchand", "France", "Natation", 4);
		Athlete florent = new Athlete("Florent", "Manaudou", "France", "Natation", 1);

		Entraineur glen = new Entraineur("Glen", "Mills", "USA", "Athlétisme");
		Entraineur bob = new Entraineur("Bob", "Bowman", "USA", "Natation");

		
		System.out.println(" Sportifs et Entraineurs ");
		jeux.ajouterParticipant(usain);
		jeux.ajouterParticipant(leon);
		jeux.ajouterParticipant(florent);
		jeux.ajouterParticipant(glen);
		jeux.ajouterParticipant(bob);

		jeux.afficherTousLesParticipants();

		System.out.println(" ");
		System.out.println(" Entraineur à Sportif ");
		jeux.associerEntraineurAAthlete(usain, glen);  
		jeux.associerEntraineurAAthlete(leon, glen);   
		jeux.associerEntraineurAAthlete(florent, bob);

		System.out.println(" ");
		System.out.println(" Ensembles des participants ");
		jeux.afficherTousLesParticipants();
	}
}
