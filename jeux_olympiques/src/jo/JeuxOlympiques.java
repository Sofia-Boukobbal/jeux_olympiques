package jo;

import java.util.ArrayList;
import java.util.List;

public class JeuxOlympiques {
    private List<Participant> participants;

    public JeuxOlympiques() {
        this.participants = new ArrayList<>();
    }

    public void ajouterParticipant(Participant participant) {
        participants.add(participant);
    }

    public void afficherTousLesParticipants() {
        for (Participant p : participants) {
            p.afficher();
        }
    }

    // TODO supprimer un participant
    public void supprimerParticipant(Participant participant) {
        participants.remove(participant);
    }

    // Méthode privée demandée : signature (athlète, entraineur) -> void, lève l'exception
    private void associateTrainer(Athlete athlete, Entraineur entraineur) throws IncompatibleSportException {
        if (!athlete.getDiscipline().equalsIgnoreCase(entraineur.getDiscipline())) {
            throw new IncompatibleSportException();
        }
        athlete.setEntraineur(entraineur);
    }

    // Méthode publique qui appelle la méthode privée et gère l'exception
    public void associerEntraineurAAthlete(Athlete athlete, Entraineur entraineur) {
        try {
            associateTrainer(athlete, entraineur);
            System.out.println("Association réussie entre " + entraineur.getNomComplet() + " et l'athlète.");
        } catch (IncompatibleSportException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}