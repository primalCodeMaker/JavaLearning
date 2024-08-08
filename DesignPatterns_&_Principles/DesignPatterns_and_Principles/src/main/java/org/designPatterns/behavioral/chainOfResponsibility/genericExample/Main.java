package org.designPatterns.behavioral.chainOfResponsibility.genericExample;

public class Main {

    public static void main(String[] args) {

        GenericHandler<String> textBugHandler = new TextBugHandler();
        GenericHandler<String> textOpinionHandler = new TextOpinionHandler();

        textBugHandler.setNextHandler(textOpinionHandler);

        String result = textBugHandler.handle(
                "wzialem udzial w zaJavce i powiem wam, " +
                "zrobilem zadania i w zadaniu jest blad. " +
                "Podsumowujac, mam zla opinie o zaJavce"
        );

        System.out.println(result);
    }
}
