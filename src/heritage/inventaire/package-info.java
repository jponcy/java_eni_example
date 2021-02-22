/**
 * Le but de cet exercice est de simuler la partie données d'un logiciel d'inventaire simplifié. Nous gérons la liste
 * des articles disponibles dans un magasin.
 * Tous les produits ont :
 * 1) un prix HT
 * 2) un pourcentage de TVA
 * 3) un nom (commercial)
 *
 * Nous vendons aussi bien de la nouriture que des meubles. La nouriture a une date limite de consomation. Les meubles
 * ont un nombre de pièces, et une difficulté de montage (donné par un nombre de 1 à 5 ; 5 = très difficile).
 *
 * Définir la méthode toString sur toutes les classes (nouriture / meuble) afin d'afficher toutes les informations.
 * Nous souhaitons pouvoir contenir toutes ces informations dans un seul tableau en utilisant le polymorphisme.
 *
 *
 * Indice : Il est conseillé d'initialisé le tableau dans une classe avec le point d'entré. Et d'avoir 3 classes pour
 * représenter nos articles (Article et ses deux classes enfants : Nouriture et Meuble).
 */
package heritage.inventaire;