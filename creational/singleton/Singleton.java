public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton()
    {
        System.out.println("Instance of class is created");
    }

    public static Singleton getSingleton()
    {
        return instance;
    }

    
}
