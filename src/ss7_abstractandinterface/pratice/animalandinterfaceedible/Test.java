package ss7_abstractandinterface.pratice.animalandinterfaceedible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal i: animals){
            System.out.println(i.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Apple();
        fruits[1]=new Orange();
        for (Fruit j: fruits){
            System.out.println(j.howToEat());
        }
    }
}
