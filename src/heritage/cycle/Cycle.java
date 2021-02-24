package heritage.cycle;

import java.time.LocalDate;
import java.time.Period;
//import java.time.temporal.ChronoUnit;

public abstract class Cycle {
    private String modele;
    private String marque;
    private LocalDate dateAchat;

    public Cycle(LocalDate dateAchat, String marque, String modele) {
        this.dateAchat = dateAchat;
        this.marque = marque;
        this.modele = modele;
    }

    /**
     * Calcule l'age du cycle en fonction de sa date d'achat
     *
     * @return l'age du cycle
     */
    private String age() {
//        ChronoUnit.YEARS.between(this.dateAchat, LocalDate.now());
//        return dateAchat.until(LocalDate.now()).getYears();

        Period period = dateAchat.until(LocalDate.now());
        String result = null;

        if (period.getYears() >= 1) {
            result = period.getYears() + " ans";
        } else if (period.getMonths() >= 1) {
            result = period.getMonths() + " mois";
        } else {
            result = period.getDays() + " jours";
        }

        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.marque + " " + this.modele + " (" + this.age() + ")";
//        return this.getNomDuType() + " " [...];
    }

    public abstract float getTarifLocationHeure();
//    public abstract String getNomDuType();
}
