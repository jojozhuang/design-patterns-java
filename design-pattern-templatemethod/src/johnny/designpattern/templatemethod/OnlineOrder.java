package johnny.designpattern.templatemethod;

public class OnlineOrder extends Order {
    @Override
    public void doShopping()
    {
        System.out.println("[Online] Customer puts products to online shopping cart.");
    }

    @Override
    public void doCheckout()
    {
        System.out.println("[Online] Customer places the online order.");
    }

    @Override
    public void doPayment()
    {
        System.out.println("[Online] Customer pays the money through online payment methods.");
    }
}
