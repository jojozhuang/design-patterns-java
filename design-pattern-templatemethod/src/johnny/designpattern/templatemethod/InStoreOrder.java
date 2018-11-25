package johnny.designpattern.templatemethod;

public class InStoreOrder extends Order {
    @Override
    public void doShopping()
    {
        System.out.println("Customer selects products and puts to shopping cart.");
    }

    @Override
    public void doCheckout()
    {
        System.out.println("Customer places the order.");
    }

    @Override
    public void doPayment()
    {
        System.out.println("Customer pays the money with credit card or cash.");
    }
}
