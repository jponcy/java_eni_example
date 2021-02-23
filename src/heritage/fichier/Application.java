package heritage.fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        avecLesClasses();
    }


    public static void avecLesClasses() throws IOException {
     // 1) demander à l'utilisateur s'il veut utiliser la console ou un fichier
        System.out.println("Voulez-vous utiliser la console ou un fichier");
        System.out.println("1) Console");
        System.out.println("2) Fichier");

        // 2) si "fichier" choisi à l'étape précédente => on demande à l'utilisateur de
        // choisir le nom du fichier à créer
        Scanner scanner = new Scanner(System.in);
        Output output = null;
        // Declaration = initialisation/instantiation.
        // int i = 3;
        // Output o = new ConsoleOutput();
        String line;

        int choix = Integer.parseInt(scanner.nextLine()); // On fait confiance ici en l'utilisateur.

        switch (choix) {
            case 1: // Mode console.
                output = new ConsoleOutput();
                break;
            case 2: // Mode fichier.
                System.out.println("Dans quel fichier voulez-vous avoir vos résultats ?");
                String filepath = scanner.nextLine();
                output = new FileOutput(filepath);
                // On pourrait vérifier la validite du nom du fichier (possede une extension, pas un PDF, ...).
                break;
            default:
                System.err.println("Choix non compris, fin du programme");
                System.exit(-1); // Quitte le programme ; -1 => erreur.
        }

        // 3)
        while (true) { // Boucle inifinie (tant que VRAI) ; on prefere normallement eviter cela.
            System.out.println("Merci de saisir une phrase");
            line = scanner.nextLine(); // Recuperation saisie utilisateur.

            output.write(line); // Soit Output est un ConsoleOutput, soit un FileOutput =>
        }

//        scanner.close();
    }


    public static void sansLesClasses() throws IOException {
        // 1) demander à l'utilisateur s'il veut utiliser la console ou un fichier
        System.out.println("Voulez-vous utiliser la console ou un fichier");
        System.out.println("1) Console");
        System.out.println("2) Fichier");

        // 2) si "fichier" choisi à l'étape précédente => on demande à l'utilisateur de
        // choisir le nom du fichier à créer
        Scanner scanner = new Scanner(System.in);
        String filepath = null;
        String line;

        int choix = Integer.parseInt(scanner.nextLine()); // On fait confiance ici en l'utilisateur.

        switch (choix) {
            case 1: // Mode console.
                // Ne rien faire - filepath = null => mode console active.
                break;
            case 2: // Mode fichier.
                System.out.println("Dans quel fichier voulez-vous avoir vos résultats ?");
                filepath = scanner.nextLine();
                // On pourrait vérifier la validite du nom du fichier (possede une extension, pas un PDF, ...).
                break;
            default:
                System.err.println("Choix non compris, fin du programme");
                System.exit(-1); // Quitte le programme ; -1 => erreur.
        }

        // 3)
        while (true) { // Boucle inifinie (tant que VRAI) ; on prefere normallement eviter cela.
            System.out.println("Merci de saisir une phrase");
            line = scanner.nextLine(); // Recuperation saisie utilisateur.

            if (filepath == null) { // Mode console.
                System.out.println("Vous avez saisi : " + line);
            } else { // Mode fichier.
//                File file = new File(filepath);
//                FileWriter fw = new FileWriter(file);
                // -------
//                FileOutputStream fileOutputStream = new FileOutputStream(file);
//                BufferedOutputStream bs = new BufferedOutputStream(fileOutputStream);
                // -------
                FileWriter fw = new FileWriter(new File(filepath), true);

                fw.append(line + "\n"); // Ecriture dans le fichier.

                fw.close(); // Fermeture de l'acces a la ressource externe.
            }
        }

//        scanner.close();
    }
}
