package johnny.designpattern.templatemethod.test;

import johnny.designpattern.templatemethod.Client;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        System.out.println("testClient");

        Client client = new Client();
        client.run();
    }
}
