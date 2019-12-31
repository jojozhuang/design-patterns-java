package johnny.designpattern.observer;

public class Client {
    public void run() {
        MessageServer server = new MessageServer();

        Observer user1 = new User("Johnny");
        Observer user2 = new User("George");
        Observer user3 = new User("Sean");

        server.registerObserver(user1);
        server.registerObserver(user2);
        server.registerObserver(user3);
        server.setMessage("Hello from Rong!");

        System.out.println("----------------------------------------------");
        server.removeObserver(user3);
        server.setMessage("We are using Java to send message!");
    }
}
