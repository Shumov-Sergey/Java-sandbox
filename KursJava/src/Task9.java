import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 14.09.2015.
 */
public class Task9 extends Task {

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
        int a = 0, b = 0, c = 0, res = 0;
        File file = new File(System.getProperty("user.dir")+"\\src\\Task9.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                Task9 t = new Task9();
                t.setStart();
                out.println("#9 Pythagoras's three.");
                out.println("Time start: " + t.getStart());
                for (a = 1; a < 500; a++) {
                    for (b = 1; b < 500; b++) {
                        for (c = 1; c < 700; c++) {
                            if ((a + b + c == 1000) && (a * a + b * b == c * c)) {
                                res = a * b * c;
                            }
                        }
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
