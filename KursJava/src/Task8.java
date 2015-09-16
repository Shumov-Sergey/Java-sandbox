/**
 * Created by user on 14.09.2015.
 */
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Task8 extends Task {

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
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\temp.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        String tmp;
        File file = new File(System.getProperty("user.dir")+"\\src\\Task8.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                Task8 t = new Task8();
                t.setStart();
                out.println("#8 Consecutive figures");
                out.println("Time start: " + t.getStart());
                while ((tmp = reader.readLine()) != null) {
                    line += tmp;
                }
                reader.close();
                char[] tmpSrtCh = line.toCharArray();
                long res = 0;
                for (int i = 0; i < 1000; i++) {
                    long s = 1;
                    if (i == 988) {
                        break;
                    }
                    for (int j = i; j < (i + 13); j++) {
                        s = s * Integer.parseInt(String.valueOf(tmpSrtCh[j]));
                        if (s > res) {
                            res = s;
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
