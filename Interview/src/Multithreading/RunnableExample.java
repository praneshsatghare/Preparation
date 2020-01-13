package Multithreading;

public class RunnableExample {

    public static void main(String args[]){
        System.out.println("Main Thread Started. \nMainThread Name " +  Thread.currentThread().getName() + "\nMainThread Id " +  Thread.currentThread().getId() + "\nMainThread State " +  Thread.currentThread().getState());
        Thread r1 =  new Thread(new StartsRun("Thread 1 Runnable "));
        Thread r2 =  new Thread(new StartsRun("Thread 2 Runnable "));
        r1.start();
        r2.start();
    }
}

class WorkerThreadRunnable implements Runnable {
    private String threadName;

    public WorkerThreadRunnable(String thradName){
        this.threadName = thradName;
    }

    @Override
    public void run(){
        for(int i=0; i < 10; i++){
            System.out.println("Thread Name " + this.threadName + " Thread.currentThread().getName() " + Thread.currentThread().getName() + "\n############################");
        }
    }
}