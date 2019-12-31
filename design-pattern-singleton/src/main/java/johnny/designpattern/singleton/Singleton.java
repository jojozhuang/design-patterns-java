package johnny.designpattern.singleton;

/*
 * Singleton Pattern
 */

// Define class as final, so it can't be inherited
public final class Singleton {
    private static Singleton instance;

    // Declare a private constructor to prevent class instances from being created in any other places
    private Singleton() {}
    
    // Use a static method to get instance of this class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
    
    // Dummy methods
    public String getDummyString() {
        return "hello";
    }
}
