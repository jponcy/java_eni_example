package heritage.zoo.version2;


interface Animal {
    void seDeplacer();
    void seReposer();
}

class ChatPecheur implements Animal {
    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace avec agilité");
    }

    @Override
    public void seReposer() {
        System.out.println("Je ne dors que d'un oeil");
    }
}

class Sanglier implements Animal {
    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace avec un air féroce");
    }

    @Override
    public void seReposer() {
        System.out.println("Je ronfle");
    }
}

class Dauphin implements Animal {
    @Override
    public void seDeplacer() {
        System.out.println("Je nage et je joue");
    }

    @Override
    public void seReposer() {
        System.out.println("Je rêve de jouer");
    }
}


abstract class Enclos {
    static final int NB_ANIMAUX_PAR_ENCLOS = 5;
    private Animal[] animaux = new Animal[Enclos.NB_ANIMAUX_PAR_ENCLOS];
    private int compteurAnimaux = 0;

    public void ajoutAnimal(Animal animal) {
        if (this.ilResteDesPlaces()) {
            this.animaux[this.compteurAnimaux] = animal;
            this.compteurAnimaux++;
        }
    }

    public boolean peutRentrer(Animal animal) {
        return this.ilResteDesPlaces() && this.pasDautreEspece(animal) && this.lanimalEstCompatible(animal);
    }

    protected abstract boolean lanimalEstCompatible(Animal animal);

    private boolean pasDautreEspece(Animal animal) {
        //     l'enclos (terrain) est vide OU le premier animal a la même espèce.
        return this.compteurAnimaux == 0   || this.animaux[0].getClass().equals(animal.getClass());
    }

    private boolean ilResteDesPlaces() {
        return this.compteurAnimaux < Enclos.NB_ANIMAUX_PAR_ENCLOS;
    }
}

class Terrain extends Enclos {

    @Override
    protected boolean lanimalEstCompatible(Animal animal) {
        return /* animal instanceof Sanglier || */animal instanceof ChatPecheur;
//        return animal instanceof Terrestre && !(animal instanceof Aquatique);
    }
}

class Bassin extends Enclos {

    @Override
    protected boolean lanimalEstCompatible(Animal animal) {
        return animal instanceof Dauphin;
//        return !(animal instanceof Terrestre) && animal instanceof Aquatique;
    }
}

class TerrainBassin extends Enclos {
    @Override
    protected boolean lanimalEstCompatible(Animal animal) {
        return true;
    }
}


public class ZooV2 {
    public static void main(String[] args) {
        Animal[] animaux = new Animal[4];
        animaux[0] = new ChatPecheur();
        animaux[1] = new ChatPecheur();
        animaux[2] = new Sanglier();
        animaux[3] = new Dauphin();

        Enclos[] enclos = new Enclos[2];
        enclos[0] = new Terrain();
        enclos[1] = new Terrain();

        for (Animal animal : animaux) {
            boolean pasTrouve = true;
            int i = 0;

            while (pasTrouve && i < enclos.length) {
                if (enclos[i].peutRentrer(animal)) {
                    enclos[i].ajoutAnimal(animal);
                    pasTrouve = false;
                } else {
                    i++;
                }
            }
            // --------
//            for (Enclos e : enclos) {
//                if (e.peutRentrer(animal)) {
//                    e.ajoutAnimal(animal);
//                    break;
//                }
//            }
        }
    }
}
