package johnny.designpattern.templatemethod;

public abstract class Order {
    abstract void doShopping();
    abstract void doCheckout();
    abstract void doPayment();

    //template method
    public final void processOrder(){

        //add products to shopping cart
        doShopping();

        //place the order
        doCheckout();

        //pay money
        doPayment();
    }
}
