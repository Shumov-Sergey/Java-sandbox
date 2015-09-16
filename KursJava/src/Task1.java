import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 10.09.2015.
 */
public class Task1 extends Task {

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
        int sum = 0;
        Task1 t = new Task1();
        File file = new File(System.getProperty("user.dir")+"\\src\\Task1.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                t.setStart();
                out.println("#1 Multiple numbers.");
                out.println("Time start: " + t.getStart());
                for (int i = 0; i < 1000; i++) {
                    if (i % 3 == 0 || i % 5 == 0) {
                        sum += i;
                    }
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
