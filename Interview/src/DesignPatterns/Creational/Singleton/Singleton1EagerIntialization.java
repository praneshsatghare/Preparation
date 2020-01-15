package DesignPatterns.Creational.Singleton;
// This Example of Eager Initialization
public class Singleton1EagerIntialization {
    private static Singleton1EagerIntialization singleton1EagerIntialization = new Singleton1EagerIntialization();
    private Singleton1EagerIntialization(){
    }
    public static Singleton1EagerIntialization getInstance(){
        return singleton1EagerIntialization;
    }
}

//

// Problem with this method
//      We are Creating Object with Eager Initialization. So it will create Object in memory though we don't require it
// Solution
//      Check Singleton2LazyInitialization.java for solution

//Possible Questions
//      Qsn - Why we are initializing object with static and private in Singleton ?
//      Ans  - We want to create single Object of this class Since we don't want separate copy of variable for each Object.
//             We are creating this as static.
//