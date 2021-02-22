package fr.eni.ecole.quelMedecin.bo;

public class Personne {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private Adresse adresse;

    public Personne(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public String getNom() {
        return this.nom.toUpperCase(); // Je retourne le nom en majuscule
    }

    public String getNumeroDeTelephone() {
        return this.numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String nouveauNumero) {
        this.numeroDeTelephone = nouveauNumero;
    }

    public void afficher() {
        // Première ligne : NOM prenom
        System.out.println(this.getNom() + " " + this.prenom);

        // Deuxième ligne : Téléphone
        System.out.println("Téléphone : " + this.getNumeroDeTelephone());

//        this.afficherSpecial();
//
//        // Affichage de l'adresse du médecin
//        this.getAdresseMedecin().afficher();
    }

//    protected void afficherSpecial() {}
}
