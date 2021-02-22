package fr.eni.ecole.quelMedecin.bo;

public class Adresse {
    private String mentions;
    private int numeroVoie;
    private String complementVoie;
    private String voie;
    private int codePostal;
    private String ville;

    public Adresse(String mentions, int numeroVoie, String complementVoie, String voie, int codePostal, String ville) {
        this.mentions = mentions;
        this.numeroVoie = numeroVoie;
        this.complementVoie = complementVoie;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Adresse(int numeroVoie, String complementVoie, String voie, int codePostal, String ville) {
        this.numeroVoie = numeroVoie;
        this.complementVoie = complementVoie;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public void afficher() {
        // ZAC du Moulin Neuf (optionnelle)
        if (this.mentions != null) {
            System.out.println(this.mentions);
        }

        // 2B rue Benjamin Franklin
        System.out.println(
                this.numeroVoie + ((this.complementVoie != null) ? this.complementVoie : "") + " " + this.voie);

        // 44800 SAINT HERBLAIN
        System.out.printf("%05d %s %n", this.codePostal, this.ville);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        // ZAC du Moulin Neuf (optionnelle)
        if (this.mentions != null) {
            sb.append(this.mentions + "\n");
        }

        // 2B rue Benjamin Franklin
        sb.append(
                this.numeroVoie + ((this.complementVoie != null) ? this.complementVoie : "") + " " + this.voie + "\n");

        // 44800 SAINT HERBLAIN
        sb.append(String.format("%05d %s %n", this.codePostal, this.ville));

        return sb.toString();
    }
}
