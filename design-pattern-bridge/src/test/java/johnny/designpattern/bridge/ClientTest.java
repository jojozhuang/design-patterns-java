package johnny.designpattern.bridge;

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
