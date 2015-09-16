import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 10.09.2015.
 */
public class Task2 extends Task {

    private long start;
    private long stop;

    public void setStart(){
        start = System.currentTimeMillis();
    }

    public long getStart(){
        return start;
    }

    public void setStop(){
        stop = System.currentTimeMillis();
    }

    public long getStop(){
        return stop;
    }

    public long getProcessTime(){
        return (stop - start);
    }

    public void run() {
        int previous = 1;
        int current = 2;
        int next = 0;
        long sum = 2;
        Task2 t = new Task2();
        t.setStart();
        File file = new File(System.getProperty("user.dir")+"\\src\\Task2.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.println("#2 Fibonacci's number.");
                out.println("Time start: " + t.getStart());
                while (next < 4000000){
                    next = previous + current;
                    if (next > 4000000){
                       break;
                    }
                    if (next%2 == 0){
                        sum+=next;
                    }

                    previous = current;
                    current = next;
                }
                t.setStop();
                out.println("Time stop: " + t.getStop());
                out.println("Time diff: " + t.getProcessTime());
                out.println("Resultat: " + sum);
            }finally{
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
