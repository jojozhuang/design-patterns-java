package johnny.designpattern.singleton;

/*
 * Singleton Pattern
 */

// Define class as final, so it can't be inherited
public final class Singleton4 {
    private volatile static Singleton4 instance;

    // Declare a private constructor to prevent class instances from being created in any other places
    private Singleton4() {}
    
    // Use a static method to get object of this class
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) { // Double-Check!
                    instance = new Singleton4();
                }
            }
        }
        
        return instance;
    }
    
    // Dummy methods
    public String getDummyString() {
        return "hello";
    }
}
