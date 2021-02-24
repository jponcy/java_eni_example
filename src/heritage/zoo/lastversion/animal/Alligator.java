package heritage.zoo.lastversion.animal;

import heritage.zoo.lastversion.animal.classification.AnimalSemiAquatique;

public class Alligator implements AnimalSemiAquatique {

    @Override
    public void seDeplacer() {
        System.out.println("Je cours, je nage, je suis un tout terrain.");
    }

    @Override
    public void seReposer() {
        System.out.println("Je dors, il en faut de l'energie pour un tout terrain.");
    }
}
