import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws IOException {

        Connection connect = Jsoup.connect("https://github.com/primalCodeMaker/JavaLearning/graphs/contributors");
        Document document = connect.get();

        Elements myElement = document.getElementsByClass("color-fg-success text-normal");
        myElement.eachText();

        for (Element elem : myElement) {
            System.out.println(elem);
        }

        Predicate predicate = (a -> true);

    }

}


