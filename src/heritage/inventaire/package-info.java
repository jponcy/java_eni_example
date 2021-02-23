/**
 * Le but de cet exercice est de simuler la partie données d'un logiciel d'inventaire simplifié. Nous gérons la liste
 * des articles disponibles dans un magasin.
 * Tous les produits ont :
 * 1) un prix HT
 * 2) un pourcentage de TVA
 * 3) un nom (commercial)
 * 4) une référence produit
 *
 * Nous vendons aussi bien de la nouriture que des meubles. La nouriture a une date limite de consomation. Les meubles
 * ont un nombre de pièces, et une difficulté de montage (donné par un nombre de 1 à 5 ; 5 = très difficile).
 *
 *
 * === Partie 1 ===
 *
 * Définir la méthode toString sur toutes les classes (nouriture / meuble) afin d'afficher toutes les informations.
 * Nous souhaitons pouvoir contenir toutes ces informations dans un seul tableau en utilisant le polymorphisme.
 *
 *
 * Indice : Il est conseillé d'initialisé le tableau dans une classe avec le point d'entré. Et d'avoir 3 classes pour
 * représenter nos articles (Article et ses deux classes enfants : Nouriture et Meuble).
 *
 *
 * === Partie 2 ===
 *
 * On bouclera sur tous les articles pour afficher toutes les données (appel de la méthode toString de chaque objet).
 * Exemple de boucle :
 * Article[] articles = [...];
 *
 * for (int i = 0; i < articles.length; i++) {
 *     System.out.println((i + 1) + ") " + articles[i]);
 * }
 *
 *
 * === Partie 3 ===
 *
 * Nous souhaitons ajouter le calcul du prix avec taxe (prix TTC). Modifier les classes, pour que cette nouvelle donnée
 * soit aussi affiché lors de la boucle.
 *
 *
 * === Partie 4 ===
 *
 * Nous allons désormais faire des intéractions avec l'utilisateur. Au démarage de l'application, nous demanderons à
 * l'utilisateur ce qu'il veut faire parmis les choix suivants (les actions seront à réaliser) :
 * 1) afficher l'inventaire
 * 2) ajouter un produit alimentaire
 * 0) quitter le programme
 *
 * Une fois une action réalisée, nous reproposerons à l'utilisateur de faire une nouvelle action (jusqu'à ce qu'il
 * quitte le programme).
 *
 *
 * === Partie 5 ===
 *
 * Nous permettons désormais d'ajouter aussi des meuble (3) ajout un meuble).
 *
 *
 * === Bonnus ===
 *
 * Ajouter une gestion de fichier pour concerver les données entre deux executions du programme
 * (le fichier est lu au démarage du programme ; chaque ajout/suppression provoque une sauvegarde du fichier).
 */
package heritage.inventaire;