package johnny.designpattern.singleton;

/*
 * Singleton Pattern
 */

// define class as final, so it can't be inherited
public final class Singleton4 {
    private volatile static Singleton4 instance;
    
    // use a static method to get object of this class
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {// Double-Check!
                    instance = new Singleton4();
                }
            }
        }
        
        return instance;
    }
    
    // declare a private constructor, so only itself can instantiate an object.
    private Singleton4() {}
        
    // dummy methods
    public String getDummyString() {
        return "hello";
    }
}
