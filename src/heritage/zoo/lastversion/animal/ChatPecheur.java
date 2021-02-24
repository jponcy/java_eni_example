package heritage.zoo.lastversion.animal;

import heritage.zoo.lastversion.animal.classification.AnimalTerrestre;

public class ChatPecheur implements AnimalTerrestre {

    @Override
    public void seDeplacer() {
        System.out.println("miaou");
    }

    @Override
    public void seReposer() {
        System.out.println("Attention, j'ai toujours un oeil ouvert !");
    }
}
