package exception.calculatrice;

import java.util.Scanner;

public class Calculatrice {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int entier1 = Calculatrice.saisirEntier();
        char operateur = 'q';

        do {
            try {
                operateur = Calculatrice.saisirOperateur();
                // Tester que operateur soit != 'q'
                int entier2 = Calculatrice.saisirEntier();
                int resultat;

                switch (operateur) {
                case '+':
                    resultat = Operation.ajouter(entier1, entier2); // peut lancer/propager une erreur
                    System.out.println(entier1 + " + " + entier2 + " = " + resultat);
                    entier1 = resultat;
                    break;

                case '/':
                    // En evitant l'exception (/ by zero).
//                    if (entier2 == 0) {
//                        System.err.println("La division par zéro n'est pas définie !");
//                    } else {
//                        resultat = entier1 / entier2;
//                        System.out.println(entier1 + " / " + entier2 + " = " + resultat);
//                        entier1 = resultat;
//                    }
                    // ------
                    // En utilisant l'exception.
                    try {
                        resultat = entier1 / entier2;
                        System.out.println(entier1 + " / " + entier2 + " = " + resultat);
                        entier1 = resultat;
                    } catch (ArithmeticException e) {
                        System.err.println("La division par zéro n'est pas définie !");
                    }
                    break;

                default:
                    break;
                }
            } catch (DepassementCapaciteException e) {
                System.err.println("Le résultat dépasse la capacité de la calculatrice");
            }
        } while (operateur != 'q');

        System.out.println(entier1);

        Calculatrice.scanner.close();
    }

    private static char saisirOperateur() {
        String saisie;
        boolean operateurValide = false;
        char operateur;

        System.out.println("opérateur ? (+ - * / % ou q pour quitter)");

        do {
            saisie = Calculatrice.scanner.nextLine().trim();
            operateur = saisie.charAt(0);

            if (operateur == '+' || operateur == '-' || operateur == '*' || operateur == '/' || operateur == '%'
                    || operateur == 'q') {
                operateurValide = true;
            } else {
                System.err.println("Operateur non disponible (+ - * / % ou q pour quitter)");
            }
        } while (operateurValide == false);

//        scanner.close();

        return operateur;
    }

    private static int saisirEntier() {
        String chaineSaisie = null;
        int entierSaisi = 0;
        System.out.println("Saisir un nombre entier :");

        boolean saisieNombreValide = false;

        // Nous aurions par exemple pu boucler sur les caractères un à un pour vérifier
        // que c'est des nombres.
        // chaineSaisie.toCharArray()

        while (saisieNombreValide == false) {
            chaineSaisie = Calculatrice.scanner.nextLine().trim();

            try {
                entierSaisi = Integer.parseInt(chaineSaisie); // "3" => 3
                saisieNombreValide = true;
            } catch (NumberFormatException e) { // if entierSaisie == 9999999999|bonjour|...
                try {
                    Long.parseLong(chaineSaisie);
                    // Si on arrive ici, c'est que chaineSaisie est un nombre (hors borne d'un int
                    // mais pas d'un long).
                    System.err.println("La valeur saisie dépasse les capacités de cette calculatrice. Réessayez...");
                } catch (NumberFormatException e2) {
                    System.err.println("Saisie incorrecte. Réessayez...");
                }
            }
        }

        // int => Integer
        // char => Character
        // float => Float
        // long => Long
        // double => Double
        // ...

//        scanner.close();

        return entierSaisi;
    }
}
