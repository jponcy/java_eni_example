package heritage.zoo;


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


interface Enclos {
    static final int NB_ANIMAUX_PAR_ENCLOS = 5;

    void ajoutAnimal(Animal animal);
    boolean peutRentrer(Animal animal);
}

class Terrain implements Enclos {
    private Animal[] animaux = new Animal[Enclos.NB_ANIMAUX_PAR_ENCLOS];
    private int compteurAnimaux = 0;

    @Override
    public void ajoutAnimal(Animal animal) {
        if (this.compteurAnimaux < Enclos.NB_ANIMAUX_PAR_ENCLOS) {
            this.animaux[this.compteurAnimaux] = animal;
            this.compteurAnimaux++;
        }
    }

    @Override
    public boolean peutRentrer(Animal animal) {
        return this.ilResteDesPlaces(animal) && this.pasDautreEspece(animal) && this.lanimalEstCompatible(animal);
    }

    // Pas generalisable.
    private boolean lanimalEstCompatible(Animal animal) {
        return animal instanceof Sanglier || animal instanceof ChatPecheur;
    }

    private boolean pasDautreEspece(Animal animal) {
        return this.compteurAnimaux == 0 || this.animaux[0].getClass().equals(animal.getClass());
    }

//    instance of
//      A // oui
//      B // oui
//    ->C // oui
//      D // non
//    getClass().equal
//      A // non
//      B // non
//      ->C // oui
//      D // non

    private boolean ilResteDesPlaces(Animal animal) {
        return this.compteurAnimaux < Enclos.NB_ANIMAUX_PAR_ENCLOS;
    }
}



public class Zoo {
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
                }

                i++;
            }
        }
    }
}
