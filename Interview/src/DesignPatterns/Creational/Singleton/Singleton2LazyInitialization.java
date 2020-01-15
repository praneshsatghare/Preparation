package DesignPatterns.Creational.Singleton;

public class Singleton2LazyInitialization{
        private static Singleton2LazyInitialization singleton2LazyInitialization ;
        private Singleton2LazyInitialization(){
        }
        public static Singleton2LazyInitialization getInstance(){
            if (singleton2LazyInitialization == null) {
                singleton2LazyInitialization = new Singleton2LazyInitialization();
            }
            return singleton2LazyInitialization;
        }
}



// Problem with this method
//      We are Creating Object with Lazy Initialization but we during multithreading scenario two thread may ask for
//      Singleton object from getInstance() method and hence we may break singleton property of class.

//        1)The first thread enters the getInstance() method, while instance is still not initialized
//        2)The second thread takes over before the first thread could create the singleton instance and creates it
//        3)The first thread continues and creates its own instance


// Solution
//        We can put this code in Synchronization block. Check for Singleton3ThreadSafe

//Possible Questions
//      Qsn - Why we are initializing object with static and private in Singleton ?
//      Ans  - We want to create single Object of this class Since we don't want separate copy of variable for each Object.
//             We are creating this as static.
//