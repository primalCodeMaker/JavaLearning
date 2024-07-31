package org.designPatterns.creational.builder;

public class BuilderImpl implements Builder {

    private String firstName;
    private String lastName;
    private String email;


    @Override
    public Builder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public Builder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public Builder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public User build() {
        return new User(firstName, lastName, email);
    }
}
