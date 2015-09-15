/**
 * Created by user on 14.09.2015.
 */
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Task8 {

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\KursJava\\src\\temp.txt"));
        String line = "";
        String tmp;
        long start = System.currentTimeMillis();
        System.out.println("#8 Consecutive figures");
        System.out.println("Time start: " + start);
        while ((tmp = reader.readLine()) != null) {
            line+=tmp;
        }
        char[] tmpSrtCh = line.toCharArray();
        long res = 0;
        for(int i = 0; i < 1000; i++){
            long s = 1;
            if(i == 988){
                break;
            }
            for(int j = i; j < (i+13); j++){
                s = s * Integer.parseInt(String.valueOf(tmpSrtCh[j]));
                if (s > res){
                    res = s;
                }
            }
        }

        long stop = System.currentTimeMillis();
        System.out.println("Time stop: " + stop);
        System.out.println("Time diff: " + (stop - start));
        System.out.println("Resultat: " + (res));
    }
}
