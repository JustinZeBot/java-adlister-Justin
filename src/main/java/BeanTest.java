import models.Author;
import models.Quote;

import java.util.ArrayList;

public class BeanTest  {

    public static void main(String[] args) {

        Author williamSleator =  new Author(1,"William", "Sleator");
        Author justinReich = new Author(2, "Justin", "Reich");

        Quote quote1 = new Quote(1, "I am a writer!", williamSleator);
        Quote quote2 = new Quote( 2, "I am a dev writer!", justinReich);

        System.out.println("quote1 = " + quote1.getAuthor().getFirstName());
        System.out.println("quote2 = " + quote2.getContent());

        ArrayList<Quote> quotes = new ArrayList<>();

        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quote : quotes) {
            String text = quote.getAuthor().getFirstName() + " said: " + quote.getContent();
            System.out.println(text);
        }


    }

}
