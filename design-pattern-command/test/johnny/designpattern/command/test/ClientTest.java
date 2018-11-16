package johnny.designpattern.command.test;

import johnny.designpattern.command.Client;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        // Bridge
        System.out.println("testClient");
        Client client = new Client();
        client.run();
    }
}
