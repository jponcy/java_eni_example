package heritage.cycle;

import java.time.LocalDate;

public class Velo extends Cycle {
    private static final float TARIF_VELO = 4.9f;

    private int nbVitesse;

    public Velo(LocalDate dateAchat, String marque, String modele, int nbVitesse) {
        super(dateAchat, marque, modele);
        this.nbVitesse = nbVitesse;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.nbVitesse + " vitesses";
//        return "Velo " + [...];
//        return "Velo " + super.toString();
    }

//    @Override
//    public String getNomDuType() {
//        return "Velo";
//    }

    @Override
    public float getTarifLocationHeure() {
        return Velo.TARIF_VELO;
    }
}
