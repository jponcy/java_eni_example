package exception.example.de;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        De de = new De();
        System.out.println("Nous allons initialiser les dès");
        System.out.println("Combien de face a votre dè");

        int a = 3;

        try {
            a = 2;     // Passe (a vaut donc 2).
            a = 4 / 0; // Provoque une exception (/ by zero).
            ++a;       // Ignore (a cause de l'exception).
            a += 4;    // Ignore (a cause de l'exception).
        } catch (ArithmeticException e) {
            System.out.println("On vient d'éviter un crash");
        } finally {
            System.out.println(a); // On pourrait aussi simplement mettre cette instruction après le try/catch.
        }

        try {
            int value = scanner.nextInt();

            try {
                de.setNbFaces(value);
            } catch (DeRuntimeException e) {
                de.setNbFaces(8);
            }

            System.out.println(de);
        } catch (InputMismatchException e) {
            System.err.println("Fallait mettre un nombre arabe");
        } catch (Exception e) {
            System.err.format("Aucune idée de ce qui s'est passé, mais ça marche pas => %s%n", e.getMessage());

//            throw new RuntimeException("Nop", e);
//            e.printStackTrace();
        }

        scanner.close();
    }
}
