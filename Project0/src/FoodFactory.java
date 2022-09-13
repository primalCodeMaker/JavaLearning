import person.ConsumingMan;
import person.Producent;
import person.ProducingMan;
import person.Consumer;
import product.Food;

public class FoodFactory {


    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.run();
    }

    private void run() {
        ProducingMan[] producingPeople = new ProducingMan[] {
                new Producent("Alicja", "Zupowa"),
                new Producent("Krzysztof","Ciastkarski")
        };

        ConsumingMan[] consumingPeople = new ConsumingMan[] {
                new Consumer("Rafal", "Pozeracz",  "chocolate"),
                new Consumer("Angelika", "Zajadacz","fish"),

        };
        int counter = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
            counter++;

            }
        }
        Food[] foods = new Food[counter];

        int index = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
               Food food = producingPerson.produce(consumingPerson.getExpectations(), consumingPerson);
                foods[index] = food;
                index++;
            }

        }

        System.out.println("PRINTING FOOD");
        for (Food food : foods) {
            System.out.println(food);
        }
    }
}
