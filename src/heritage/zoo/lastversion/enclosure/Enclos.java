package heritage.zoo.lastversion.enclosure;

import heritage.zoo.lastversion.animal.classification.Animal;

public abstract class Enclos {
    /** Nombre maximum d'animaux que nous pouvons mettre par enclos. */
    private final static int NB_ANIMAUX_PAR_ENCLOS = 5;
    private Animal[] animaux = new Animal[Enclos.NB_ANIMAUX_PAR_ENCLOS];

    /** Combien d'animaux sont actuellement dans l'enclos. */
    private int compteurAnimaux = 0;

    @Override
    public String toString() {
        return String.format(
                "%-13s %d/%d (%s)",
                this.getClass().getSimpleName(),
                this.compteurAnimaux,
                Enclos.NB_ANIMAUX_PAR_ENCLOS,
                this.compteurAnimaux == 0 ? "inoccupé" : this.animaux[0].getClass().getSimpleName());
    }

    public void ajouterAnimal(Animal animal) {
        if (this.ilResteDesPlaces()) {
            this.animaux[this.compteurAnimaux] = animal;
            this.compteurAnimaux++;
        }
    }

    public boolean peutRentrer(Animal animal) {
        return this.ilResteDesPlaces() && this.pasDautreEspece(animal) && this.estCompatible(animal);
    }

    public abstract boolean estCompatible(Animal animal);

    private boolean ilResteDesPlaces() {
        return this.compteurAnimaux < Enclos.NB_ANIMAUX_PAR_ENCLOS;
    }

    private boolean pasDautreEspece(Animal animal) {
        return this.compteurAnimaux == 0 || this.animaux[0].getClass().equals(animal.getClass());
    }
}
