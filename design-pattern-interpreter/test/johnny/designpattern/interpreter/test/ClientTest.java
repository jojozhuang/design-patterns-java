package johnny.designpattern.interpreter.test;

import johnny.designpattern.interpreter.Client;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        System.out.println("testClient");

        Client client = new Client();
        client.run();
    }
}
