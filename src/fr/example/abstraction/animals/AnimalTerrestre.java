package fr.example.abstraction.animals;

public class AnimalTerrestre implements Animal {

    @Override
    public void seDeplacer() {
        this.marcher();
    }

    private void marcher() {
        System.out.println("Je marche");
    }
}
