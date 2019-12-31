package johnny.designpattern.flyweight;

import org.junit.jupiter.api.Test;


public class ClientTest {

    @Test
    public void testClient() {
        System.out.println("testClient");

        Client client = new Client();
        client.draw();
    }
}