package org.designPatterns.behavioral.chainOfResponsibility.functionalLambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        UnaryOperator<String> textZajavkaHandler = (String input) ->
                input.replace("Zajavka nie jest super", "Zajavka jest Super!");

        UnaryOperator<String> textBugHandler = (String input) ->
                input.replace("w zadaniu jest blad", "w zadaniu nie ba bledu");

        UnaryOperator<String> textOpinionHandler = (String input) ->
                input.replace("mam zla opinie o zaJavce", "Zajavka jest Super!");

        Function<String, String> functionalLambdaSolution = textZajavkaHandler
                .andThen(textBugHandler
                        .andThen(textOpinionHandler
                        )
                );

        String input = (
                "wzialem udzial w zaJavce i powiem wam Zajavka nie jest super,  " +
                        "zrobilem zadania i w zadaniu jest blad. " +
                        "Podsumowujac, mam zla opinie o zaJavce"
        );

        String result = functionalLambdaSolution.apply(input);
        System.out.println(result);
    }
}
