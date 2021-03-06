package johnny.designpattern.singleton;

/*
 * Singleton Pattern
 */

// Define class as final, so it can't be inherited
public final class Singleton2 {
    private static Singleton2 instance;
    
    // Declare a private constructor to prevent class instances from being created in any other places
    private Singleton2() {}

    // Use a static method to get instance of this class
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        
        return instance;
    }
    
    // Dummy methods
    public String getDummyString() {
        return "hello";
    }
}
