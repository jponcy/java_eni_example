package heritage.cycle;

import java.time.LocalDate;

public abstract class CycleElectrique extends Cycle {

    /** Autonomie en Km. */
    private int autonomie;

    public CycleElectrique(LocalDate dateAchat, String marque, String modele, int autonomie) {
        super(dateAchat, marque, modele);
        this.autonomie = autonomie;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.autonomie + " km d'autonomie";
    }
}
