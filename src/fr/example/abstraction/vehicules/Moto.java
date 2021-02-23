package fr.example.abstraction.vehicules;

public class Moto extends VehiculeMotorise {

    public Moto() {
        this(20);
    }

    public Moto(int capaciteReservoir) {
        super(capaciteReservoir);
    }
}
