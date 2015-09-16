/**
 * Created by user on 14.09.2015.
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Task7 extends Task {

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

    // проверка на простоту
    public static boolean isPrime(long n){
        boolean res = false;

        if(n == 2){
            res = true;
            return res;
        }
        for (long i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return res;
            }
        }
        res = true;
        return res;
    }

    public void run() {
        int count = 0;
        int res = 0;
        File file = new File(System.getProperty("user.dir")+"\\src\\Task7.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                Task7 t = new Task7();
                t.setStart();
                out.println("#7 SimpleNumbers.");
                out.println("Time start: " + t.getStart());
                for (int i = 2; i < 1000000000; i++) {
                    if (isPrime(i)) {
                        count += 1;
                    }
                    if (count == 10001) {
                        res = i;
                        break;
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
