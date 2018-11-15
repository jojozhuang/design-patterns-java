package johnny.designpattern.adapter.test;

import johnny.designpattern.adapter.Client;
import johnny.designpattern.adapter.ProblematicClient;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        // Problematic
        System.out.println("testProblematicClient");
        ProblematicClient pc = new ProblematicClient();
        pc.run();

        // Adapter
        System.out.println("testClient");
        Client client = new Client();
        client.run();
    }
}
