package heritage.zoo.lastversion;

import heritage.zoo.lastversion.animal.Alligator;
import heritage.zoo.lastversion.animal.ChatPecheur;
import heritage.zoo.lastversion.animal.Dauphin;
import heritage.zoo.lastversion.animal.Phoque;
import heritage.zoo.lastversion.animal.classification.Animal;
import heritage.zoo.lastversion.enclosure.Bassin;
import heritage.zoo.lastversion.enclosure.Enclos;
import heritage.zoo.lastversion.enclosure.EnclosComplet;
import heritage.zoo.lastversion.enclosure.Terrain;

public class Zoo {
    public static void main(String[] args) {
        // Initialisation des listes.
        Animal[] animaux = Zoo.listAnimaux();
        Enclos[] enclos = Zoo.listEnclos();

        // Affectations des enclos pour les animaux.
        for (Animal animal : animaux) {
            boolean pasTrouve = true;
            int i = 0;

            while (pasTrouve && i < enclos.length) {
                if (enclos[i].peutRentrer(animal)) {
                    enclos[i].ajouterAnimal(animal);
                    pasTrouve = false;
                } else {
                    i++;
                }
            }
        }

        // Affichage des enclos.
        System.out.println("Affichage de l'état des enclos :");
        for (int i = 0; i < enclos.length; i++) {
            System.out.format("%d) %s%n", i + 1, enclos[i].toString());
        }
    }

    private static Enclos[] listEnclos() {
        Enclos[] result = new Enclos[8];

        result[0] = new Bassin();
        result[1] = new Bassin();
        result[2] = new Terrain();
        result[3] = new Terrain();
        result[4] = new Terrain();
        result[5] = new Terrain();

        // Les enclos complets sont mis en dernier pour les remplir uniquement en dernier recours
        // (si aucun autre enclos ne convient ; cela nous évite un tri ultérieur ou des tests supplémentaires).
        result[6] = new EnclosComplet();
        result[7] = new EnclosComplet();

        return result;
    }

    private static Animal[] listAnimaux() {
        Animal[] result = new Animal[18];
        int i = 0;

        for (; i < 9; i++) {
            result[i] = new ChatPecheur();
        }

        for (; i < 13; i++) {
            result[i] = new Dauphin();
        }

        result[i++] = new Alligator();
        result[i++] = new Alligator();
        result[i++] = new Phoque();
        result[i++] = new Phoque();
        result[i++] = new Phoque();

        return result;
    }
}
