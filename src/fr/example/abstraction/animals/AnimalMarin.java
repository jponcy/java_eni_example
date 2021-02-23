package fr.example.abstraction.animals;

public class AnimalMarin implements Animal {

    @Override
    public void seDeplacer() {
        this.nager();
    }

    private void nager() {
        System.out.println("Je nage");
    }

}
