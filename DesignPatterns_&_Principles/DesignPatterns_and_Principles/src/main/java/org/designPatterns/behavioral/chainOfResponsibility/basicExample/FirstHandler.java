package org.designPatterns.behavioral.chainOfResponsibility.basicExample;

import lombok.Setter;

public class FirstHandler implements Handler {

    @Setter
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        System.out.println("First handler is processing request: " + request.getData());
        String newDATA = request.getData();
        newDATA = "somethink new";
        if (nextHandler != null) {
            nextHandler.handleRequest(request);

        }
    }
}
