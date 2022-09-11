package person;

import product.Chocolate;
import product.Food;
import product.Sandwich;
import product.Soup;

public class Producent extends Person implements ProducingMan {


    public Producent(String name, String surname) {
        super(name, surname);
    }


    @Override
    public void consume(Food food) {
        System.out.println("Produent consuming food :" + food);
    }

    @Override
    public String getExpectations() {
        return "no expectations";
    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        switch (productName) {
            case "chocolate":
                return new Chocolate(productName,this, consumingMan);
            case "soup":
                return new Soup(productName,this, consumingMan);
            default:
                return new Sandwich(productName,this, consumingMan);
        }

    }


}

