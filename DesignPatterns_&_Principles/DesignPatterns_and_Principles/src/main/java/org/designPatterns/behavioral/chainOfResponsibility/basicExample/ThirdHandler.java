package org.designPatterns.behavioral.chainOfResponsibility.basicExample;

import lombok.Setter;

public class ThirdHandler implements Handler {

    @Setter
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        System.out.println("Third handler is processing request: " + request.getData());
        // wykonaj swoją część obsługi
        if (nextHandler != null) {
            nextHandler.handleRequest(request);

        }
    }
}
