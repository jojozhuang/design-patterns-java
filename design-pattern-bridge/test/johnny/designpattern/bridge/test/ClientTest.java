package johnny.designpattern.bridge.test;

import johnny.designpattern.bridge.Client;
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
