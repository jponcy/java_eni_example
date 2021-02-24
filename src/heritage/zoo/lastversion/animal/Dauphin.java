package heritage.zoo.lastversion.animal;

import heritage.zoo.lastversion.animal.classification.AnimalAquatique;

public class Dauphin implements AnimalAquatique {

    @Override
    public void seDeplacer() {
        System.out.println("J'aime jouer.");
    }

    @Override
    public void seReposer() {
        System.out.println("Je rêve de jouer.");
    }
}
