package heritage.zoo.lastversion.animal;

import heritage.zoo.lastversion.animal.classification.AnimalSemiAquatique;

public class Phoque implements AnimalSemiAquatique {

    @Override
    public void seDeplacer() {
        System.out.println("Je suis trop beau quand je bouge, regardez !!");
    }

    @Override
    public void seReposer() {
        System.out.println("Je suis trop beau quand je dort, regardez !!");
    }
}
