package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Patient {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private char sexe;
    private long numeroSecuriteSociale;
    private LocalDate dateNaissance;
    private String commentaires;
    private Adresse adressePatient;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroSecuriteSociale,
            LocalDate dateNaissance, String commentaires, Adresse adressePatient) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.sexe = sexe;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.dateNaissance = dateNaissance;
        this.commentaires = commentaires;
        this.adressePatient = adressePatient;
    }

    public String getNom() {
        return nom.toUpperCase();
    }

    private String getSexeFrancais() {
        if (this.sexe == 'F') {
            return "F�minin";
        } else {
            return "Masculin";
        }
    }

    private String getDateNaissanceFrancais() {
        return this.dateNaissance.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH));
    }

    public void afficher() {
        // Premiere ligne : NOM et pr�nom
        System.out.println(this.getNom() + " " + this.prenom);

        // Ligne 2 : t�l�phone
        System.out.println("T�l�phone : " + this.numeroDeTelephone);

        // Ligne 3 : Sexe
        System.out.println("Sexe : " + this.getSexeFrancais());

        // Ligne 4 : Num�ro s�cu
        System.out.println("Num�ro S�curit� Social : " + this.numeroSecuriteSociale);

        // Ligne 5 : Date de naissance
        System.out.println("Date de naissance : " + this.getDateNaissanceFrancais());

        // Ligne 6 : Commentaires
        System.out
                .println("Commentaires : " + ((this.commentaires == null) ? "[aucun commentaire]" : this.commentaires));

        // Affichage de l'adresse
        this.adressePatient.afficher();
    }
}
