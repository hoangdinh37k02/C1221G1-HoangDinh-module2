package ss7_abstractandinterface.pratice.animalandinterfaceedible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: chic chic";
    }

    @Override
    public String howToEat() {
        return "chicken fried";
    }
}
