package jo;

public class GestionJeuxOlympiques {
    public static void main(String[] args) {
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

        jeux.afficherTousLesParticipants();

        System.out.println("\n=== Tentatives d'association ===");
        jeux.associerEntraineurAAthlete(usain, glen);   // même discipline -> OK
        jeux.associerEntraineurAAthlete(leon, glen);    // disciplines différentes -> exception
        jeux.associerEntraineurAAthlete(florent, bob);  // même discipline -> OK

        System.out.println("\n=== Après association ===");
        jeux.afficherTousLesParticipants();
    }
}
