package generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {

    public static void main(String[] args) {

        List<String> string = new ArrayList<>();
        string.add("some string");
        string.add("sedond string");

        List<UnboundedWildcards> tuna = new ArrayList<>();
        tuna.add(new UnboundedWildcards());

        ptint(string);
        ptint(tuna);

        List<?> newStrings = string;
        // newStrings.add("other string");
        // przepisywanie listy przy pomocy operatora <?> nie pozwala na dodawanie nowych elementow
        newStrings.get(0); // mozna pobierac i usuwac elementy

    }

    private static void ptint(List<?> list) {
        System.out.println(list);
    }

}

