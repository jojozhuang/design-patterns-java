package johnny.designpattern.builder;

public class Client {
    public void run() {
        Waiter waiter = new Waiter();
        PizzaBuilder cheesePizzaBuilder = new CheesePizzaBuilder();
        PizzaBuilder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();

        waiter.setPizzaBuilder( pepperoniPizzaBuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}
