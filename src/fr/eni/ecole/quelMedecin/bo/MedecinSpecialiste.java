package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste extends Medecin {
    private String specialite;
    private int tarif = 90;

    public MedecinSpecialiste(String nom, String prenom,
            String numeroDeTelephone, Adresse adresseMedecin, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresseMedecin);
        this.specialite = specialite;
        this.tarif = tarif;
    }

    @Override
    public void afficher() {
        super.afficher();

        // Specialite
        System.out.println("Spécialité : " + this.specialite);

        // Troisième ligne : Tarif
        System.out.println("Tarif : " + this.tarif + " €");

        this.afficherAdresseEtCreneaux();
    }
}
