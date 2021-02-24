package heritage.zoo.lastversion.enclosure;

import heritage.zoo.lastversion.animal.classification.Animal;
import heritage.zoo.lastversion.animal.classification.AnimalAquatique;
import heritage.zoo.lastversion.animal.classification.AnimalSemiAquatique;

public class Bassin extends Enclos {

    @Override
    public boolean estCompatible(Animal animal) {
        return animal instanceof AnimalAquatique && !(animal instanceof AnimalSemiAquatique);
    }
}
