package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste extends Medecin {

    private static int tarif = 25;

    public MedecinGeneraliste(String nomDuMedecinGeneraliste, String prenomDuMedecinGeneraliste,
            String numeroDeTelephoneDuMedecinGeneraliste, Adresse adresseMedecin) {
        super(nomDuMedecinGeneraliste, prenomDuMedecinGeneraliste, numeroDeTelephoneDuMedecinGeneraliste,
                adresseMedecin);
    }

    @Override
    public void afficher() {
        super.afficher(); // Appele de la methode definie dans Personne (car non surcharge dans Medecin).

        // Troisième ligne : Tarif
        System.out.println("Tarif : " + MedecinGeneraliste.getTarif() + " €");

        this.afficherAdresseEtCreneaux();
    }

    public static int getTarif() {
        return MedecinGeneraliste.tarif;
    }

    public static void setTarif(int nouveauTarif) {
        MedecinGeneraliste.tarif = nouveauTarif;
    }
}
