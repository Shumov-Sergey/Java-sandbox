/**
 * Created by user on 14.09.2015.
 */
public class Task9 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, res = 0;

        long start = System.currentTimeMillis();
        System.out.println("#9 Pythagoras's three.");
        System.out.println("Time start: " + start);
        for(a = 1; a < 500; a++) {
            for (b = 1; b < 500; b++) {
                for (c = 1; c < 700; c++) {
                    if ((a + b + c == 1000) && (a * a + b * b == c * c)) {
                        res = a * b * c;
                    }
                }
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time stop: " + stop);
        System.out.println("Time diff: " + (stop - start));
        System.out.println("Resultat: " + (res));
    }
}
