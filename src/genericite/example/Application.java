package genericite.example;

import java.util.ArrayList;
import java.util.List;

import heritage.zoo.lastversion.animal.Alligator;
import heritage.zoo.lastversion.animal.ChatPecheur;
import heritage.zoo.lastversion.animal.Dauphin;
import heritage.zoo.lastversion.animal.classification.Animal;
import heritage.zoo.lastversion.enclosure.Terrain;

//class MonTableauInt {
//    private int[] values = new int[5];
//    private int compteur = 0;
//
//    public void ajouter(int valeur) {
//        if (this.compteur < this.values.length) {
//            this.values[this.compteur] = valeur;
//            this.compteur++;
//        }
//    }
//}
//
//class MonTableauFloat {
//    private float[] values = new float[5];
//    private int compteur = 0;
//
//    public void ajouter(float valeur) {
//        if (this.compteur < this.values.length) {
//            this.values[this.compteur] = valeur;
//            this.compteur++;
//        }
//    }
//}

//class MonTableau {
//    private ??[] values = new ??[5];
//    private int compteur = 0;
//
//    public void ajouter(?? valeur) {
//        if (this.compteur < this.values.length) {
//            this.values[this.compteur] = valeur;
//            this.compteur++;
//        }
//    }
//}





public class Application {
    public static void main(String[] args) {
    }

    private static void premieresDemos() {
        //        new MonTableau<int>();

                ArrayList<Integer> valeurs = new ArrayList<>();

                valeurs.add(3); // Le type du paramètre est un Integer
                valeurs.add(4);
                valeurs.add(42);
                valeurs.add(1);

                valeurs.get(2); // retourne 42

                // ---

                ArrayList<String> mots = new ArrayList<>();

                mots.add("rouge"); // Le type du paramètre est un String
                mots.add("bonjour");
                mots.add("fourchette");

                mots.get(2); // retourne "fourchette"







                int[] intValues = new int[3];
                intValues[0] = 4;
                intValues[1] = 42;
                intValues[2] = 0;
        //        intValues[3] = 5;

                for (int i = 0; i < intValues.length; i++) {
                    System.out.println(intValues[i]);
                }

                // -----

                ArrayList<Integer> intList = new ArrayList<>();
                intList.add(4);
                intList.add(42);
                intList.add(0);

                for (int i = 0; i < intList.size(); i++) {
                    System.out.println(intList.get(i));
                }


                Integer val = 3;
                int valInt = val;


                List<Animal> animaux = new ArrayList<>();

                Animal tinus = new Alligator();
                animaux.add(tinus);
                animaux.add(new Dauphin());
                animaux.add(new ChatPecheur());
        //        animaux.add(new Terrain()); // Ne compile pas car un terrain n'est pas un animal (mais un enclos).
    }
}
