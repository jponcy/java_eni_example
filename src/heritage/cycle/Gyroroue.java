package heritage.cycle;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique {
    private static final float TARIF = 18.9f;

    public Gyroroue(LocalDate dateAchat, String marque, String modele, int autonomie) {
        super(dateAchat, marque, modele, autonomie);
    }

    @Override
    public float getTarifLocationHeure() {
        return Gyroroue.TARIF;
    }
}
