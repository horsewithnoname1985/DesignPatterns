package chapter1.SimUDuck;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public abstract void display();


    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys.");
    }

}