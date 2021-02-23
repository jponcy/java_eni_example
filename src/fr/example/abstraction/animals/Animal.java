package fr.example.abstraction.animals;
//
//public abstract class Animal {
//    public abstract void seDeplacer();
//}

public interface Animal {
    void seDeplacer();
}

//class Joueur {}
//
//abstract class Propriete {
//    public void arriveJoueur(Joueur j) {
//        // ...
//        this.payerLoyer(j);
//        // ...
//    }
//
//    protected abstract void payerLoyer(Joueur j);
//}
//
//class Terrain extends Propriete {
//
//    @Override
//    protected void payerLoyer(Joueur j) {
//        System.out.println("Le joueur " + j + " va casquer sévère !");
//    }
//}