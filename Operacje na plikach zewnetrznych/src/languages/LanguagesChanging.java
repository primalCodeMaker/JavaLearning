package languages;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class LanguagesChanging {

    public static void main(String[] args) {

        System.out.println("Locale def: " + Locale.getDefault());

        ResourceBundle myResources = ResourceBundle.getBundle("Store", Locale.ENGLISH);
        String mainPage = myResources.getString("mainPage");
        String footer = myResources.getString("footer");

        System.out.println(mainPage);
        System.out.println(footer);

        Locale.setDefault(ResourceBundle.getBundle("Store", Locale.getDefault()).getLocale());
        System.out.println(mainPage);
        System.out.println(ResourceBundle.getBundle("Store").getString("footer"));

        System.out.println("--------------");
        Map<String, String> collect = myResources.keySet().stream()
                .collect(Collectors.toMap(key -> key, myResources::getString));
        collect.forEach((k, v) -> System.out.println(k + " = " + v));

    }
}
