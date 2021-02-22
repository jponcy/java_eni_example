package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Patient extends Personne {
    private char sexe;
    private long numeroSecuriteSociale;
    private LocalDate dateNaissance;
    private String commentaires;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroSecuriteSociale,
            LocalDate dateNaissance, String commentaires, Adresse adressePatient) {
        super(nom, prenom, numeroDeTelephone, adressePatient);
        this.sexe = sexe;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.dateNaissance = dateNaissance;
        this.commentaires = commentaires;
    }

    private String getSexeFrancais() {
        if (this.sexe == 'F') {
            return "Féminin";
        } else {
            return "Masculin";
        }
    }

    private String getDateNaissanceFrancais() {
        return this.dateNaissance.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH));
    }

    public void afficher() {
        super.afficher();

        // Ligne 3 : Sexe
        System.out.println("Sexe : " + this.getSexeFrancais());

        // Ligne 4 : Numéro sécu
        System.out.println("Numéro Sécurité Social : " + this.numeroSecuriteSociale);

        // Ligne 5 : Date de naissance
        System.out.println("Date de naissance : " + this.getDateNaissanceFrancais());

        // Ligne 6 : Commentaires
        System.out
                .println("Commentaires : " + ((this.commentaires == null) ? "[aucun commentaire]" : this.commentaires));

        // Affichage de l'adresse
        this.getAdresse().afficher();
    }
}
