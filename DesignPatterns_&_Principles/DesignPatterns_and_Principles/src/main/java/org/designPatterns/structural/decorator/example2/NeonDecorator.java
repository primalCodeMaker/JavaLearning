package org.designPatterns.structural.decorator.example2;

public class NeonDecorator extends CarDecorator{

    public NeonDecorator(Car car) {
        super(car);
        System.out.println(" NeonDecorator constructor ");

    }

    @Override
    public String create() {
        System.out.println("calling NeonDecorator create() Before super calling");
        String created = super.create();
        System.out.println("calling NeonDecorator create() After super calling");
        return created + withNeon();
    }

    private String withNeon() {
        System.out.println("calling NeonDecorator withNeon()");
        return " + with " + this.getClass().getSimpleName();
    }
}
