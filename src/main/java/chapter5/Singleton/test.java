package chapter5.Singleton;

public class test {

    private static test t = new test( );

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private test() { }

    /* Static 'instance' method */
    public static test getInstance( ) {
        return t;
    }

    /* Other methods protected by singleton-ness */
    static void sayHello( ) {
        System.out.println("Hello");
    }
}