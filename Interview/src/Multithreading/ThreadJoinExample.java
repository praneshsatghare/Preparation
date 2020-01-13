package Multithreading;

// What is Thread?
// Thread is light weight sub process.

public class ThreadJoinExample {
    public static void main(String args[]){
        System.out.println("Main Thread Started. \nMainThread Name " +  Thread.currentThread().getName() + "\nMainThread Id " +  Thread.currentThread().getId() + "\nMainThread State " +  Thread.currentThread().getState());
        final Thread t1 = new WorkerThreadJoin("Thread 1");
        t1.setName("WorkerThread 1");
        final Thread t2 = new WorkerThreadJoin("Thread 2");
        t2.setName("WorkerThread 2");
        t1.start();
        t2.start();
    }
}

class WorkerThreadJoin extends Thread {
    private String threadName;

    public WorkerThreadJoin (final String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
        for(int i=0; i < 10; i++){
            System.out.println("Thread Name " + this.threadName + " Thread.currentThread().getName() " + Thread.currentThread().getName() + "\n############################");
        }
    }
}