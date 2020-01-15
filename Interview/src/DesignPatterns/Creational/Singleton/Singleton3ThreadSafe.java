package DesignPatterns.Creational.Singleton;

public class Singleton3ThreadSafe {
    private static Singleton3ThreadSafe singleton3ThreadSafe ;
    private Singleton3ThreadSafe(){
    }
    public static Singleton3ThreadSafe getInstance(){
        if (singleton3ThreadSafe == null) {
            synchronized(Singleton3ThreadSafe.class) {
                if (singleton3ThreadSafe == null) {
                    singleton3ThreadSafe = new Singleton3ThreadSafe();
                }
            }
        }
        return singleton3ThreadSafe;
    }
}
