package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Application {

    public static void main(String[] args) {
        Voiture voiture = new Voiture(50);
        Moto moto = new Moto();

        voiture.faireLePlein();

        Voiture[] voitures = { voiture, voiture };
        Object[] objects = { voiture, new String(), new Moto() };
        Vehicule[] vehicules = { voiture, new Moto(), new Vehicule() };

        for (Vehicule v : vehicules) {
            v.avancer();
        }

        String s; // espace de référence ; 0x0000 -> 0xF0F4
        s = new String("coucou"); //       0xF0F4 -> 6 "cases" avec coucou

//        seDeplacerEnMoto(moto, 4);
//        seDeplacerEnMoto(voiture, 4);

        seDeplacer(voiture, 4);
        seDeplacer(moto, 1);

        Vehicule v = voiture;

        seDeplacer(v, 2);
        seDeplacer(voiture, 45);

//        List vv = new Vector();
//        List al = new ArrayList();
    }

    public static void seDeplacerEnMoto(Moto moto, int distance) {
        for (int i = 0; i < distance; i++) {
            moto.avancer();
        }
    }

    public static void seDeplacerEnVoiture(Voiture voiture, int distance) {
        for (int i = 0; i < distance; i++) {
            voiture.avancer();
        }

        // Vehicule <- Moto
        //          <- Voiture
    }

    /**
     * Demonstration (abusive) d'instanceof + du cast ((Moto) v).
     */
    public static void faireUneFigure(Vehicule v) {
        if (v instanceof Moto) {           // Est-ce que c'était une moto de base.
            Moto moto = (Moto) v;
            moto.faireLaRoue();
        } else if (v instanceof Voiture) {
            Voiture voiture = (Voiture) v;
            voiture.drift();
        }
    }

    public static void seDeplacer(Vehicule v, int distance) {
        for (int i = 0; i < distance; i++) {
//            if (v instanceof Vehicule) { // Vrai si "v" est une moto ou une voiture ou un vehicule;
//            if (v instanceof Moto) {     // Vrai si "v" est une moto.
//            if (v instanceof Voiture) {  // Vrai si "v" est une voiture.
//                Voiture voiture = (Voiture) v;
//                voiture.faireLePlein();
//            }

            v.avancer();
        }
    }
}
