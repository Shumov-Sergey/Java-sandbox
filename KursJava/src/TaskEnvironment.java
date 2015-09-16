/**
 * Created by user on 16.09.2015.
 */

public class TaskEnvironment {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Task1());
        t1.start();
        Thread t2 = new Thread(new Task2());
        t2.start();
        Thread t3 = new Thread(new Task3());
        t3.start();
        Thread t4 = new Thread(new Task4());
        t4.start();
        Thread t5 = new Thread(new Task5());
        t5.start();
        Thread t6 = new Thread(new Task6());
        t6.start();
        Thread t7 = new Thread(new Task7());
        t7.start();
        Thread t8 = new Thread(new Task8());
        t8.start();
        Thread t9 = new Thread(new Task9());
        t9.start();
        Thread t10 = new Thread(new Task10());
        t10.start();
    }

}
