package johnny.designpattern.facade.test;

import java.util.Date;

import org.junit.Test;

import johnny.designpattern.facade.Client;
import johnny.designpattern.facade.problem.ProblematicClient;

public class ClientTest {

    @Test
    public void testClient() {
        // Problematic sub systems
        System.out.println("testProblematicClient");
        ProblematicClient pc = new ProblematicClient();
        pc.search(600, 400, new Date(), new Date());

        // Facade
        System.out.println("testClient");
        Client client = new Client();
        client.search(600, 400, new Date(), new Date());
    }
}
