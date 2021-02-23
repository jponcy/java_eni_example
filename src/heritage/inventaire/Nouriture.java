package heritage.inventaire;

import java.time.LocalDate;

public class Nouriture extends Article {

    private LocalDate dlc;

    public Nouriture(float prixHT, float pourcentTVA, String nom, String reference, LocalDate dlc) {
        super(prixHT, pourcentTVA, nom, reference);

        this.dlc = dlc;
    }

    @Override
    public String toString() {
//        String descParent = super.toString();
//        return descParent + this.dlc.toString();
        return super.toString() + ", DLC : " + this.dlc.toString();
    }
}
