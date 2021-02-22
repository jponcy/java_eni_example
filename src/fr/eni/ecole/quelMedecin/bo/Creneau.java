package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Creneau {
    private LocalTime heureDebut;
    private int duree;
    private MedecinGeneraliste medecinAssocie;

    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecinAssocie) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecinAssocie = medecinAssocie;

        this.medecinAssocie.ajouterCreneau(this);
    }

    public void afficher() {
        // 09:00 - 09:15 (15 minutes)
        LocalTime heureFin = this.heureDebut.plusMinutes(this.duree);
        System.out.printf("%s - %s (%d minutes) %n", heureDebut.format(DateTimeFormatter.ofPattern("HH:mm")),
                heureFin.format(DateTimeFormatter.ofPattern("HH:mm")), this.duree);
    }

    public MedecinGeneraliste getMedecin() {
        return this.medecinAssocie;
    }

}
