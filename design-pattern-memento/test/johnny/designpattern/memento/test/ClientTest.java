package johnny.designpattern.memento.test;

import johnny.designpattern.memento.Client;
import org.junit.jupiter.api.Test;


public class ClientTest {

    @Test
    public void testClient() {
        System.out.println("testClient");

        Client client = new Client();
        client.draw();
    }
}
