package johnny.designpattern.bridge.test;

import johnny.designpattern.proxy.Internet;
import johnny.designpattern.proxy.ProxyInternet;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        Internet internet = new ProxyInternet();
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
