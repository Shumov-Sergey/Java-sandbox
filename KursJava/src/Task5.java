import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 13.09.2015.
 */
public class Task5 extends Task {

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
    // проверка, делится ли число на все делители
    public static boolean smallNum(long n, int div){
        boolean res = false;
        int count = 0;
        for (int i = 2; i <= div; i++)
        {
            if (n % i == 0){
                count+=1;
            }
            else{
                break;
            }
        }
        if (count == div-1){
            res = true;
        }
        return res;
    }

    public void run(){

        long res = 0;
        File file = new File(System.getProperty("user.dir")+"\\src\\Task5.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                Task5 t = new Task5();
                t.setStart();
                out.println("#5 SmallNumber.");
                out.println("Time start: " + t.getStart());
                for (long i = 20; i < 1000000000; i += 20) {
                    if (smallNum(i, 20)) {
                        res = i;
                        break;
                    }
                }
                t.setStop();
                out.println("Time stop: " + t.getStop());
                out.println("Time diff: " + t.getProcessTime());
                out.println("Resultat: " + res);
            }finally{
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
