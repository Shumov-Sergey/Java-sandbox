/**
 * Created by user on 14.09.2015.
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.*;
public class Task6 extends Task {

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

    public static int sumSquare(int n){
        int s = 2;
        int res = 0;
        for(int i = 1; i <= n; i++){
            res+=Math.pow(i,s);
        }
        return res;
    }

    public static int squareSum(int n){
        int res = 0;
        for(int i = 1; i <= n; i++){
            res+=i;
        }
        res = (int)Math.pow(res,2);
        return res;
    }

    public void run() {
        int sumSq;
        int SqSum;
        File file = new File(System.getProperty("user.dir")+"\\src\\Task6.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                Task6 t = new Task6();
                t.setStart();
                out.println("#6 SumSquare.");
                out.println("Time start: " + t.getStart());
                sumSq = sumSquare(100);
                SqSum = squareSum(100);
                t.setStop();
                out.println("Time stop: " + t.getStop());
                out.println("Time diff: " + t.getProcessTime());
                out.println("Resultat: " + (SqSum - sumSq));
            }finally{
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

}
