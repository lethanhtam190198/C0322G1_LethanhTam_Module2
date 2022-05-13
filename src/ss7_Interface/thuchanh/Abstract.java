package ss7_Interface.thuchanh;

public class Abstract {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
        }

        Friut[] friuts = new Friut[2];
        friuts[0]= new Apple();
        friuts[1]=new Orange();
        for(Friut friut:friuts){
            System.out.println(friut.howtoEat());
        }
    }
}
