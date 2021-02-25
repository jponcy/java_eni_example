package exception.example.de;

public class De {
    private int nbFaces = 6;

    @Override
    public String toString() {
        return "Le dè a " + this.nbFaces + " faces";
    }

    public void setNbFaces(int nb) {
        this.nbFaces = nb;
        this.verifNbFaces();

    }

    private void verifNbFaces() {
        if (this.nbFaces < 2) {
            throw new DeRuntimeException("Un dé doit avoir au moins deux faces");
        }

        System.out.println("Le dè est valide");
    }
}
