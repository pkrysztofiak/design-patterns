package pl.pkrysztofiak.strategy.simuduck;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        //Rubber ducks don't quack. Overridden to squeak
        System.out.println("squeak");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck.display()");
    }

    @Override
    public void fly() {
        //Override to do nothing
    }
}
