package johnny.designpattern.facade.test;

import org.junit.Test;

import johnny.designpattern.facade.Client;

public class ClientTest {

    @Test
    public void testClient() {
        System.out.println("testClient");

        Client client = new Client();
        client.process();
    }
}
