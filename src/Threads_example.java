//Chapter 13: Practice Set

//Problem 1: To print good morning and welcome continuously on the screen using Threads
//Problem 2: Add a sleep method in Welcome thread to delay execution of Welcome for 200 milliseconds
class Thread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Good morning");
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }

            System.out.println("Welcome");
        }
    }
}

public class Threads_example {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        //Problem 3: Add getPriority() and setPriority() method
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //System.out.println(t2.getState());  // New state  --> Problem 4  (get State())
        //t1.start();
        t2.start();
        System.out.println(t2.getState());  // Runnable state --> Problem 4 (get State())
        System.out.println(Thread.currentThread().getState()); // Problem 5: Get reference to the current Thread
    }
}
