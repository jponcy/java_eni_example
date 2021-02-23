package fr.example.abstraction.vehicules;

public class Voiture extends VehiculeMotorise {

    /**
     * Constructeur par défaut.
     * La capacite du reservoire sera de 50.
     */
    public Voiture() {
//        super(50);
//        this.setNbRoues(4);
        this(50); // Appel du construteur Voiture(int capaciteReservoire)
    }

    /**
     * Constructeur principal.
     * @param capaciteReservoire Capacite maximum du reservoire.
     */
    public Voiture(int capaciteReservoire) {
        super(capaciteReservoire); // Appel du constructeur Voiture(int capaciteReservoire, int nbRoues)
    }

    @Override
    public void avancer() {
//        super.avancer();
        this.avancer(30);
    }

    public void avancer(int distance) {
        this.avancer("" + distance);
    }

    public void avancer(String route) {
        super.avancer();
    }
}
