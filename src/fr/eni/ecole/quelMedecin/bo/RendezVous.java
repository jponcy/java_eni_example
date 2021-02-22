package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RendezVous {
    private Creneau creneauPris;
    private Patient patientAssocie;
    private LocalDate date;

    public RendezVous(Creneau creneauPris, Patient patientAssocie, LocalDate date) {
        this.creneauPris = creneauPris;
        this.patientAssocie = patientAssocie;
        this.date = date;
    }

    public void afficher() {
        // Rendez-vous du 23 mai 2020 09:00 - 09:15 (15 minutes)
        System.out.printf("Rendez-vous du %s ", this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        this.creneauPris.afficher();
        // avec le Dr Malalaniche
        System.out.println("avec le Dr " + this.creneauPris.getMedecin().getNom());
        // pour PAMAMOBE Adh�mar
        System.out.print("pour ");
        this.patientAssocie.afficher();
    }
}
