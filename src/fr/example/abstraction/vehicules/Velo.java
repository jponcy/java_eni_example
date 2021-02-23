package fr.example.abstraction.vehicules;

public class Velo extends Vehicule {
    private int nbVitesse;

    @Override
    public void avancer() {
        System.out.println("J'avance");
    }

    public int getNbVitesse() {
        return nbVitesse;
    }

    public void setNbVitesse(int nbVitesse) {
        this.nbVitesse = nbVitesse;
    }
}
