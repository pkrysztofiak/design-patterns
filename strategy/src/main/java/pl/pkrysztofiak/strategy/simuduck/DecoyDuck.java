package pl.pkrysztofiak.strategy.simuduck;

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("DecoyDuck.display()");
    }

    @Override
    public void quack() {
        //Override to do nothing
    }

    @Override
    public void fly() {
        //Override to do nothing
    }
}
