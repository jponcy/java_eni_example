package fr.example.abstraction.drawer;

public class Application {
    public static void main(String[] args) {
        Point debut = new Point(4, 500);
        Point fin = new Point(40, 400);

        Line line1 = new Line(debut, fin);
        Line line2 = new Line(new Point(0, 0), new Point(500, 500));

        Line[] lines = new Line[40];
        lines[0] = line1;
        lines[1] = line2;

        Rectangle rect1 = new Rectangle(debut, 40, 40);
    }
}
