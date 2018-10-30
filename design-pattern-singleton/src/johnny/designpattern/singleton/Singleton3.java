package johnny.designpattern.singleton;

/*
 * Singleton Pattern
 */

// define class as final, so it can't be inherited
public final class Singleton3 {
	private static Singleton3 instance = new Singleton3();
    
    // use a static method to get object of this class
    public static Singleton3 getInstance() {
        return instance;
    }
    
    // declare a private constructor, so only itself can instantiate an object.
    private Singleton3() {}
        
    // dummy methods
    public String getDummyString() {
        return "hello";
    }
}
