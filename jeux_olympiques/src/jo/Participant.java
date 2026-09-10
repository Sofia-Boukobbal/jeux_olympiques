package jo;

public abstract class Participant {
    protected String prenom;
    protected String nom;
    protected String pays;
    protected String discipline;

    public Participant(String prenom, String nom, String pays, String discipline) {
        this.prenom = prenom;
        this.nom = nom;
        this.pays = pays;
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    public abstract void afficher();
}