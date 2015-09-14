import java.util.ArrayList;

/**
 * Created by user on 13.09.2015.
 */
public class Task4 {
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
    public static int max(ArrayList pol){
        int res = 0;
        for (int i = 0; i < pol.size(); i++){
            if((int)pol.get(i) > res){
                res = (int)pol.get(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList pal = new ArrayList();
        int res = 0;
        long start = System.currentTimeMillis();
        System.out.println("#4 Polindrom.");
        System.out.println("Time start: " + start);
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                if (isPalindrom(i,j)) {
                    pal.add(i*j);
                }
            }
        }
        res = max(pal);
        long stop = System.currentTimeMillis();
        System.out.println("Time stop: " + stop);
        System.out.println("Time diff: " + (stop - start));
        System.out.println("Resultat: " + res);
    }
}
