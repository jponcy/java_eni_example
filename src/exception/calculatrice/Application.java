package exception.calculatrice;

public class Application {
    public static void main(String[] args) {
        Operation.ajouterStatic(3, 4);

        Operation operation = new Operation();

        operation.ajouter(3, 4);

        int t = Integer.MIN_VALUE;
    }
}
