package johnny.designpattern.singleton;

/*
 * Singleton design pattern
 */

// define class as final, so it can't be inherited
public final class Singleton {
    private static Singleton instance;
    
    // use a static method to get object of this class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
    
    // declare a private constructor, so only itself can instantiate an object.
    private Singleton() {}
        
    // dummy methods
    public String getDummyString() {
        return "hello";
    }
}
