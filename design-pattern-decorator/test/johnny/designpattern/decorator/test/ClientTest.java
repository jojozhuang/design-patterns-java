package johnny.designpattern.decorator.test;

import johnny.designpattern.decorator.Client;
import org.junit.jupiter.api.Test;


public class ClientTest {

    @Test
    public void testClient() {
        System.out.println("testClient");

        Client client = new Client();
        client.draw();
    }
}