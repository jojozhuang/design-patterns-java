package johnny.designpattern.composite;

import johnny.designpattern.problematic.ProblematicClient;
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
