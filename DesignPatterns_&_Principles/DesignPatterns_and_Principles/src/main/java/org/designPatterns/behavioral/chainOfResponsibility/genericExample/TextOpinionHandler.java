package org.designPatterns.behavioral.chainOfResponsibility.genericExample;

public class TextOpinionHandler extends GenericHandler<String> {

    @Override
    protected String handleInput(String input) {
        return input.replace("mam zla opinie o zaJavce", "zaJavka jest Super! :)");
    }
}
