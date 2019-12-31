package johnny.designpattern.proxy;

import johnny.designpattern.proxy.Internet;
import johnny.designpattern.proxy.ProxyInternet;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        Internet internet = new ProxyInternet();
        System.out.println("Internet is working now ...");
        try
        {
            internet.connect("jojozhuang.github.io");
            internet.connect("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
