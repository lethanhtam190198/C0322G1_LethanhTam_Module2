package ss7_Interface.thuchanh;

public class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "Chicken:cluckkkk";
    }
    public String howtoEat(){
        return "Gà chiên mắm";
    }
}
