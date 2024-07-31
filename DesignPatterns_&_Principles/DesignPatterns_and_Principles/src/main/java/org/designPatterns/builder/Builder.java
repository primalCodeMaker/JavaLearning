package org.designPatterns.builder;

public interface Builder {

    Builder firstName(String firstName);
    Builder lastName(String lastName);
    Builder email(String email);
    User build();

}
