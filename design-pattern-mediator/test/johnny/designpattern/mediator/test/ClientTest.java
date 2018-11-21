package johnny.designpattern.mediator.test;

import johnny.designpattern.mediator.User;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
