import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by user on 13.09.2015.
 */
public class Task4 extends Task {

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

    public static boolean isPalindrom(int n, int m) {
        boolean res = false;
        int tmp = n * m;
        String tmpSrt = Integer.toString(tmp);
        char[] tmpSrtCh = tmpSrt.toCharArray();
        for (int i = 0; i < (tmpSrtCh.length) / 2; i++) {
            if (tmpSrtCh[i] == tmpSrtCh[tmpSrtCh.length - 1 - i]) {
                res = true;
            } else {
                res = false;
                break;
            }
        }
        return res;
    }
    // поиск максимального элемента в списке
    public static int max(ArrayList<Integer> pol){
        int res = 0;
        for (int i = 0; i < pol.size(); i++){
            if((int)pol.get(i) > res){
                res = (int)pol.get(i);
            }
        }
        return res;
    }

    public void run() {
        ArrayList<Integer> pal = new ArrayList<Integer>();
        int res = 0;
        File file = new File(System.getProperty("user.dir")+"\\src\\Task4.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                Task4 t = new Task4();
                t.setStart();
                out.println("#4 Polindrom.");
                out.println("Time start: " + t.getStart());
                int a=0;
                for (int i = 100; i <= 999; i++) {
                    a++;
                    for (int j = 99+a; j <= 999; j++) {
                        if (isPalindrom(i,j)) {
                            pal.add(i*j);
                        }
                    }
                }
                res = max(pal);
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
