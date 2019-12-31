package johnny.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Command> cmdList = new ArrayList<>();

    public void acceptCommand(Command cmd){
        cmdList.add(cmd);
    }

    public void executeCommand(){
        for (Command cmd : cmdList) {
            cmd.execute();
        }
        cmdList.clear();
    }
}
