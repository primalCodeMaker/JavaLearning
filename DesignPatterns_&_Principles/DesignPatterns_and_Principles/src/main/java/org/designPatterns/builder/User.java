package org.designPatterns.builder;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class User {

    private final String firstName;
    private final String lastName;
    private final String email;

    public static Builder builder() {
        return new BuilderImpl();
    }
}
