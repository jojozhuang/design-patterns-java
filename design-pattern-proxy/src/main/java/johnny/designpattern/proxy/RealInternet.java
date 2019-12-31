package johnny.designpattern.proxy;

public class RealInternet implements Internet
{
    @Override
    public void connect(String host)
    {
        System.out.println("Connecting to '"+ host + "' ...");
    }
}
