package jo;

public class Entraineur extends Participant {

    public Entraineur(String prenom, String nom, String pays, String discipline) {
        super(prenom, nom, pays, discipline);
    }

    public String getNomComplet() {
        return prenom + " " + nom;
    }

    @Override
    public void afficher() {
        System.out.println(prenom + " " + nom + " (" + pays + ", " + discipline + ") - entraîneur");
    }
}