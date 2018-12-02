package johnny.designpattern.visitor.test;

import johnny.designpattern.visitor.Client;
import org.junit.jupiter.api.Test;


public class ClientTest {

    @Test
    public void testClient() {
        System.out.println("testClient");

        Client client = new Client();
        client.run();
    }
}
