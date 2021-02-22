/**
 * Le but de cet exercice est de réaliser un programme qui effectura les étapes suivantes :
 * 1) demander à l'utilisateur s'il veut utiliser la console ou un fichier
 * 2) si "fichier" choisi à l'étape précédente => on demande à l'utilisateur de choisir le nom du fichier à créer
 * 3) le programme passe ensuite en "mode écoute", il attends que l'utilisateur saisisse des phrases en console
 *    (utilisation de Scanner) puis répète ces phrase en console OU dans le fichier suivant e choix de l'utilisateur
 *    lors de la premiere étape
 * 4) si ce n'est pas déjà fait, nous ferons que les seules conditions présentes (if) soit réalisées en phase
 *    d'initialisation. En d'autres termes, nous utiliserons un polymorphisme entre les deux sorties possibles
 *    (console/fichier ; les classes peuvent pas exemple être nommées : Output, ConsoleOutput, FileOutput).
 * 5) Nous permettrons désormais un nouveau choix en phase 1: les deux ; adaptez le code pour permettre cela toujours
 *    sans rajouter de condition superflue (utilisation d'un tableau ou d'une liste possible).
 */
package heritage.fichier;
