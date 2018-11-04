package johnny.designpattern.dto.test;

import org.junit.jupiter.api.Test;

import johnny.designpattern.dto.BookableDTO;
import johnny.designpattern.dto.Client;
import johnny.designpattern.common.Flight;
import johnny.designpattern.common.Hotel;

public class ClientTest {

    @Test
    public void testClient() {
        System.out.println("testClient");

        Client client = new Client();
        BookableDTO dto = client.process();
        
        for (Flight flight : dto.flights) {
            System.out.println(flight);
        }
        
        for (Hotel hotel : dto.hotels) {
            System.out.println(hotel);
        }
    }
}
