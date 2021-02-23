package fr.example.abstraction.vehicules;

public class Application {
    public static void main(String[] args) {
        Velo bmx = new Velo();
        Vehicule vtc = new Velo();

        Vehicule[] vehicules = {
                bmx,
                vtc,
                new Voiture(),
                new Moto()
        };

        for (int i = 0; i < vehicules.length; i++) {
            vehicules[i].avancer();
        }
    }
}
