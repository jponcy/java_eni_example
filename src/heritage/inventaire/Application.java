package heritage.inventaire;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Meuble table = new Meuble(30f, 20f, "Table", "t0523xC", 5, 1);
        Nouriture sandwich = new Nouriture(3.4f, 20f, "Sandwich thon", "st525f", LocalDate.of(2021, 8, 20));
        Article salade = new Nouriture(3f, 20f, "Salade", "VC514", LocalDate.now().plusDays(3));

        Article[] articles = new Article[20];
        articles[0] = table;
        articles[1] = salade;
        articles[2] = sandwich;
        articles[3] = new Meuble(840f, 20f, "Bureau électrique", "Bd852FRE", 40, 4);

        for (int i = 0; i < 4 /* articles.length */; i++) {
            System.out.println((i + 1) + ") " + articles[i]);
        }

//        for (Article article : articles) {
//            System.out.println(article);
//        }
    }
}
