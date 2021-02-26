package enumeration.example;

//enum Couleur {
//    ROUGE, // 0
//    VERT,  // 1
//    BLANC  // 2
//}
enum Couleur {
    ROUGE("red"),  // 0
    VERT("green"),  // 1
    BLANC("white"),  // 2
    NOIR("black");  // 2

    private String en;

    private Couleur(String en) {
        this.en = en;
    }

    public String getEnglish() {
        return en;
    }
}

class ClassCouleur {
    private int rouge;
    private int vert;
    private int bleu;

    public ClassCouleur(int rouge, int vert, int bleu) {
        this.rouge = rouge;
        this.vert = vert;
        this.bleu = bleu;
    }

    public int getRouge() {
        return rouge;
    }

    public int getVert() {
        return vert;
    }

    public int getBleu() {
        return bleu;
    }
}

enum Tarification {
    SIMPLE(4.9f),
    ELECTRIQUE(14.8f),
    GROS_MOTEUR(29.9f);

    private float prix;

    private Tarification(float prix) {
        this.prix = prix;
    }

    public float getPrix() {
        return prix;
    }
}

public class Application {
    public static void main(String[] args) {
        Couleur c = Couleur.NOIR;

//        ClassCouleur rouge = new ClassCouleur(255, 0, 0);

        switch (c) { // Pas besoin de repreciser le nom de l'enumeration dans les cas d'un switch.
        case BLANC:
            System.out.println("La couleur : Blanc");
            break;
        case VERT:
            System.out.println("La couleur : Vert");
            break;

        default:
            System.out.println(c.name() + " se traduit " + c.getEnglish());
            break;
        }

        for (Couleur couleurValue : Couleur.values()) {
            System.out.format("%d. %s%n" , couleurValue.ordinal(), couleurValue);
        }


        System.out.println("Les tarifications disponibles sont :");
        for (Tarification tarif : Tarification.values()) {
            System.out.format("%s. %s => %4.2f €/h%n", tarif.ordinal(), tarif.name(), tarif.getPrix());
        }
    }
}
