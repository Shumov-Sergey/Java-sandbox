import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 14.09.2015.
 */
public class Task10 extends Task{

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
        long res = 0;
        File file = new File(System.getProperty("user.dir")+"\\src\\Task10.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                Task10 t = new Task10();
                t.setStart();
                out.println("#10 SumSimpleNumbers.");
                out.println("Time start: " + t.getStart());
                for (long i = 2; i < 2000000; i++) {
                    if (Task7.isPrime(i)) {
                        res += i;
                    }
                }
                t.setStop();
                out.println("Time stop: " + t.getStop());
                out.println("Time diff: " + t.getProcessTime());
                out.println("Resultat: " + (res));
            }finally{
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
