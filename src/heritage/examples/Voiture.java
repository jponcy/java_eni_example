package heritage.examples;

enum Couleur {
    ROUGE, BLEU, VERT
}

//00
//01
//02
//03
//04
//05
//06
//07
//08
//09
//10
//
//00
//01
//10
//11
//
//
//2^8


public class Voiture extends Vehicule {
    private int carburant;
    private int capaciteCarburant;
    private Couleur couleur;

    public Voiture(int capaciteCarburant) {
        this.capaciteCarburant = capaciteCarburant;
        this.couleur = Couleur.BLEU;
    }

    public void avancer() {
        if (this.carburant > 0) {
            System.out.println("J'avance comme une voiture, il me reste " + this.carburant + " litres");
            this.carburant--;
        } else {
            System.out.println("Plus de carburant");
        }
    }

    public void reculer() {
        if (this.carburant > 0) {
            System.out.println("Je recule comme une voiture, il me reste " + this.carburant + " litres");
            this.carburant--;
        } else {
            System.out.println("Plus de carburant");
        }
    }

    public void drift() {
        if (this.carburant >= 2) {
            System.out.println("Je drift");
            this.carburant -= 2;
        } else {
            System.out.println("Plus de carburant");
        }
    }

    public void faireLePlein() {
        this.carburant = this.capaciteCarburant;
    }
}
