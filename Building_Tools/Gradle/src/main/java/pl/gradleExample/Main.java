package pl.gradleExample;

import org.jsoup.Jsoup;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("yo yo");

        System.out.println(Jsoup.connect("https://zajavka.pl/").get().title());


    }
}