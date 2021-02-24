package heritage.cycle;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique {
    private static final float TARIF = 29.9f;

    private int tailleMinimale;

    public Gyropode(LocalDate dateAchat, String marque, String modele, int autonomie, int tailleMinimale) {
        super(dateAchat, marque, modele, autonomie);
        this.tailleMinimale = tailleMinimale;
    }

    @Override
    public String toString() {
//        160 / 100 => 1.6
//        160 / 100 => 1
//        160 - 1 * 100 => 60
        //
        //  160 | 100
        //- 100 +----
        //= --- |001
        //   60 |
        //      |

        String taille = (this.tailleMinimale / 100) + "m" + (this.tailleMinimale % 100);
        return super.toString() + " [" + taille + " min]";
    }

    @Override
    public float getTarifLocationHeure() {
        return Gyropode.TARIF;
    }
}
