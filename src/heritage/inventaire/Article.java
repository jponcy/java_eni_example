package heritage.inventaire;

public class Article {
    private float prixHT;

    /** Pourcentage de TVA compris dans la plage [0-100 ]. */
    private float pourcentTVA;

    /** Nom commercial. */
    private String nom;

    /** Référence du produit. */
    private String reference;

//    private float prixTTC;

    public Article(float prixHT, float pourcentTVA, String nom, String reference) {
        this.prixHT = prixHT;
        this.pourcentTVA = pourcentTVA;
        this.nom = nom;
        this.reference = reference;
//        this.prixHT = this.computePrixTTC();
//        this.prixTTC = this.prixHT * (1 + this.pourcentTVA / 100);
    }

    @Override
    public String toString() {
//        float prixTTC = this.prixHT * (1 + this.pourcentTVA / 100);
        return this.nom + " (" + this.reference + ") a " + this.prixHT + " € (HT), taxe:  " + this.pourcentTVA
                + "% => " + this.computePrixTTC() + " € (TTC)";
    }

    private float computePrixTTC() {
        return this.prixHT * (1 + this.pourcentTVA / 100);
    }
}
