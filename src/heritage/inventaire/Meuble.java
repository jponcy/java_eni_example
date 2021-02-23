package heritage.inventaire;

public class Meuble extends Article {

    private int nbPieces;

    /** Difficulte exprime avec un nombre de 1 (facile) à 5 (dur). */
    private int difficulte;

    public Meuble(float prixHT, float pourcentTVA, String nom, String reference, int nbPieces, int difficulte) {
        super(prixHT, pourcentTVA, nom, reference);

        this.nbPieces = nbPieces;
        this.difficulte = difficulte;
    }

    @Override
    public String toString() {
        return String.format("%s, difficulté : %d, %d pièces", super.toString(), this.difficulte, this.nbPieces);
    }
}
