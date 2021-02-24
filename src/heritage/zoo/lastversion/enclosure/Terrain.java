package heritage.zoo.lastversion.enclosure;

import heritage.zoo.lastversion.animal.classification.Animal;
import heritage.zoo.lastversion.animal.classification.AnimalSemiAquatique;
import heritage.zoo.lastversion.animal.classification.AnimalTerrestre;

public class Terrain extends Enclos {

    @Override
    public boolean estCompatible(Animal animal) {
        return animal instanceof AnimalTerrestre && !(animal instanceof AnimalSemiAquatique);
    }
}
