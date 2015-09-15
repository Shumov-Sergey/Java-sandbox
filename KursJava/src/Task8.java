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
        while ((tmp = reader.readLine()) != null) {
            line+=tmp;
        }
        char[] tmpSrtCh = line.toCharArray();
        long smax = 0;
        for(int i = 0; i < 1000; i++){
            long s = 1;
            for(int j = i; j <= (i+13); j++){
                s = s * Integer.parseInt(String.valueOf(tmpSrtCh[i]));
                if (s > smax){
                    smax = s;
                }
            }
        }

        System.out.println(smax);
    }
}
