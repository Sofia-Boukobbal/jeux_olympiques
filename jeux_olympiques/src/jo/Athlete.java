package jo;

public class Athlete extends Participant {
    private int nombreMedailles;
    private Entraineur entraineur; // null tant qu'aucun entraineur n'est associé

    public Athlete(String prenom, String nom, String pays, String discipline, int nombreMedailles) {
        super(prenom, nom, pays, discipline);
        this.nombreMedailles = nombreMedailles;
    }

    public void setEntraineur(Entraineur entraineur) {
        this.entraineur = entraineur;
    }

    @Override
    public void afficher() {
        System.out.println(prenom + " " + nom + " (" + pays + ", " + discipline
                + ") - " + nombreMedailles + " médailles"
                + (entraineur != null ? " - entraîné par " + entraineur.getNomComplet() : ""));
    }
}