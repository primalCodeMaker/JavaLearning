package org.designPatterns.structural.decorator.example2;

public class SpoilerDecorator extends CarDecorator {

    public SpoilerDecorator(Car car) {
        super(car);
        System.out.println("  SpoilerDecorator constructor ");
    }

    @Override
    public String create() {
        System.out.println("  calling SpoilerDecorator create() Before super calling ");
        String created = super.create();
        System.out.println("  calling SpoilerDecorator create() After super calling ");
        return created + withSpoiler();

    }

    private String withSpoiler() {
        System.out.println("  calling SpoilerDecorator withSpoiler()");
        return " with + " + this.getClass().getSimpleName();
    }
}
