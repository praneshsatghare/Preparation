package Multithreading;

public class StartVsRunMethod {

    public static void main(String args[]){
        System.out.println("Main Thread Started. \nMainThread Name " +  Thread.currentThread().getName() + "\nMainThread Id " +  Thread.currentThread().getId() + "\nMainThread State " +  Thread.currentThread().getState());
        Thread r1 =  new StartsRun("Thread 1");
        Thread r2 =  new StartsRun("Thread 2");
        r1.start();
        r2.run();
    }
}

class StartsRun extends Thread {
    private String threadName;

    public StartsRun(String thradName){
        this.threadName = thradName;
    }

    @Override
    public void run(){
        for(int i=0; i < 10; i++){
            System.out.println("Thread Name " + this.threadName + " Thread.currentThread().getName() " + Thread.currentThread().getName() + "\n############################");
        }
    }
}

