package johnny.designpattern.singleton;

/*
 * Singleton Pattern
 */

// define class as final, so it can't be inherited
public final class Singleton2 {
    private static Singleton2 instance;
    
    // use a static method to get object of this class
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        
        return instance;
    }
    
    // declare a private constructor, so only itself can instantiate an object.
    private Singleton2() {}
        
    // dummy methods
    public String getDummyString() {
        return "hello";
    }
}
