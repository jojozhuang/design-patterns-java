package johnny.designpattern.singleton;

/*
 * Singleton Pattern
 */

// Define class as final, so it can't be inherited
public final class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    
    // Declare a private constructor to prevent class instances from being created in any other places
    private Singleton3() {}

    // use a static method to get instances of this class
    public static Singleton3 getInstance() {
        return instance;
    }
    
    // Dummy methods
    public String getDummyString() {
        return "hello";
    }
}
