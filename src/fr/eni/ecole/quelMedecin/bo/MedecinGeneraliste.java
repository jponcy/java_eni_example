package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste extends Personne {

    private Creneau[] agenda;
    private int position = 0;

    private static int tarif = 25;

    public MedecinGeneraliste(String nomDuMedecinGeneraliste, String prenomDuMedecinGeneraliste,
            String numeroDeTelephoneDuMedecinGeneraliste, Adresse adresseMedecin) {
        super(nomDuMedecinGeneraliste, prenomDuMedecinGeneraliste, numeroDeTelephoneDuMedecinGeneraliste,
                adresseMedecin);
        this.agenda = new Creneau[15];
    }

    public static int getTarif() {
        return MedecinGeneraliste.tarif;
    }

    public static void setTarif(int nouveauTarif) {
        MedecinGeneraliste.tarif = nouveauTarif;
    }

    public void ajouterCreneau(Creneau cre) {
        this.agenda[this.position] = cre;

        this.position++;
    }

    public void afficher() {
        super.afficher();

        // Troisième ligne : Tarif
        System.out.println("Tarif : " + MedecinGeneraliste.getTarif() + " €");

        // Affichage de l'adresse du médecin
        this.getAdresse().afficher();

        // Affichage de l'agenda
        for (int i = 0; i < this.agenda.length; i++) {
            if (this.agenda[i] != null) {
                this.agenda[i].afficher();
            }
        }
    }

//    protected void afficherSpecial() {
//     // Troisième ligne : Tarif
//        System.out.println("Tarif : " + MedecinGeneraliste.getTarif() + " €");
//    }
}
