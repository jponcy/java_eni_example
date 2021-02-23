package fr.example.abstraction.vehicules;

public abstract class VehiculeMotorise extends Vehicule {
    private int niveauReservoire;
    private int capactiteMaxReservoire;
//
//    public VehiculeMotorise() {
//        // TODO Auto-generated constructor stub
//    }

    public VehiculeMotorise(int capactiteMaxReservoire) {
        this.capactiteMaxReservoire = capactiteMaxReservoire;
        this.niveauReservoire = capactiteMaxReservoire;
    }

    @Override
    public void avancer() {
        if (this.aDeLessence()) {
            System.out.println("Je roule, il me reste " + this.niveauReservoire + " litres");
        }
    }

    public boolean aDeLessence() {
        return this.niveauReservoire > 0;
    }

    public void faireLePlein() {
        this.niveauReservoire = this.capactiteMaxReservoire;
    }
}
