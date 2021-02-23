package fr.example.abstraction.drawer;

public class Rectangle {
    private Point origin;
    private int hauteur;
    private int largeur;

    public Rectangle(Point origin, int hauteur, int largeur) {
        this.origin = origin;
        this.hauteur = hauteur;
        this.largeur = largeur;
    }
}
