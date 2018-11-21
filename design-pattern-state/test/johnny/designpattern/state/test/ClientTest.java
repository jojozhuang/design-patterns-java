package johnny.designpattern.state.test;

import johnny.designpattern.state.Context;
import johnny.designpattern.state.StartState;
import johnny.designpattern.state.StopState;
import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void testClient() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
