package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private Adresse adresseMedecin;
    private Creneau[] agenda;
    private int position = 0;

    private static int tarif = 25;

    public MedecinGeneraliste(String nomDuMedecinGeneraliste, String prenomDuMedecinGeneraliste,
            String numeroDeTelephoneDuMedecinGeneraliste, Adresse adresseMedecin) {
        this.nom = nomDuMedecinGeneraliste;
        this.prenom = prenomDuMedecinGeneraliste;
        this.numeroDeTelephone = numeroDeTelephoneDuMedecinGeneraliste;
        this.adresseMedecin = adresseMedecin;
        this.agenda = new Creneau[15];
    }

    public Adresse getAdresseMedecin() {
        return this.adresseMedecin;
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
        // Premi�re ligne : NOM prenom
        System.out.println(this.getNom() + " " + this.prenom);

        // Deuxi�me ligne : T�l�phone
        System.out.println("T�l�phone : " + this.getNumeroDeTelephone());

        // Troisi�me ligne : Tarif
        System.out.println("Tarif : " + MedecinGeneraliste.getTarif() + " �");

        // Affichage de l'adresse du m�decin
        this.getAdresseMedecin().afficher();

        // Affichage de l'agenda
        for (int i = 0; i < this.agenda.length; i++) {
            if (this.agenda[i] != null) {
                this.agenda[i].afficher();
            }
        }
    }
}
