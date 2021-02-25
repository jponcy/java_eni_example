package exception.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Speacker extends RuntimeException {
    public void hello() {
        System.out.println("Bonjour");
    }
}

public class Bases {
    public static void main(String[] args) {
        // Runtime exceptions - erreur de programmation.
//        Bases.faitUnNullPointerException();
//        Bases.faitUnArrayIndexOutOfBoundsException();
//        Bases.faitUnArithmeticException();
//        Bases.lanceUneRuntimeException();

        // Exception - erreur d'utilisation.
//        Bases.lireFichierInexistant();

//        throw new RuntimeException();
//        if (3 <= 4) {
//            throw new Speacker();
//        }
//
//        System.out.println("coucou");

        try {
            int i = 4;
            Bases.lanceUneRuntimeException();
            System.out.println(i);
        } catch (RuntimeException e) {
            System.err.println("Oups");
        }
    }

    private static void lireFichierInexistant() {
        try {
            File f = new File("inexistant643T332.txt");
            FileReader fr = new FileReader(f);

            fr.close();
            System.out.println("On a pu ouvrir le fichier");
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'est pas trouvé");
        } catch (IOException e) {
            System.out.println("Une erreur inconnue s'est produit");
        }
    }

    private static void lireFichierDonneParLutilisateur() {
        File file = null;
        FileReader fileReader = null;
        Scanner scanner = new Scanner(System.in);
        String path;

        while (file == null) {
            System.out.println("Merci de saisir l'adresse du fichier à ouvrir");
            path = scanner.nextLine();
            file = new File(path);

            try {
                fileReader = new FileReader(file);
            } catch (FileNotFoundException e) {
                System.err.println("Le fichier demandé n'existe pas");
                file = null;
            }
        }

        scanner.close();

//         Utilisation du fichier...

        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace(); // Changer pour une gestion custom.
        }
    }

    private static void lireFichierDonneParLutilisateur2() {
        File file = null;
        FileReader fr = null;
        Scanner scanner = new Scanner(System.in);

        while (file == null) {
            System.out.println("Merci de saisir l'adrese du fichier à lire");
            file = new File(scanner.nextLine());

            if (file.exists() && file.canRead()) {
                try {
                    fr = new FileReader(file);
                } catch (FileNotFoundException e) {
                    // Cas traite par le IF (file.exists() && file.canRead())
                }
            } else {
                file = null;
            }
        }

        if (fr != null) {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }

    private static void lanceUneRuntimeException() {
        throw new RuntimeException("Runtime exception lancée manuellement");
    }

    private static void faitUnArithmeticException() {
        int t = 3 / 0;
    }

    private static void faitUnArrayIndexOutOfBoundsException() {
        int[] tab = new int[2]; // Possede deux "cases" : 0 et 1

        tab[2] = 2;
    }

    private static void faitUnNullPointerException() {
        Speacker s = null;

        s.hello();
    }
}

// Sans les exceptions (par exemple en C) :
///**
// *
// * @return
// * -1 => fichier n'existe pas
// */
//int lireFichier(char* path) {
//
//}
//
///**
// *
// * @return
// * -1 => echec siasie utilisateur
// * -2 => fichier n'existe pas
// * -3 =>
// */
//int lireFichierSup() {
//    // TODO: ask path to user.
//    int lireFichierResult = lireFichier(path);
//    int result;
//
//    switch (lireFichierResult) {
//    case -1:
//        result = -2;
//        break;
//    // ...
//    }
//
//    return result;
//}
//
//int main() {
//    if (lireFichier("toto") > 0) {
//
//    }
//}
