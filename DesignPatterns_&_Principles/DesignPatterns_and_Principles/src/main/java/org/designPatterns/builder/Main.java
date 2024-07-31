package org.designPatterns.builder;

public class Main {

    public static void main(String[] args) {

        User user = User.builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .email("test.email@gmail.com")
                .build();
        System.out.println(user);

        User user2 = User.builder()
                .firstName("Jan")
                .lastName("Kowalski")
                .build();
        System.out.println(user2);

    }
}
