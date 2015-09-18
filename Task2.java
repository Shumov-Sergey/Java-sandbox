/**
 * Created by marker on 18/09/2015.
 */
public class Task2 {
    public static void main(String[] args) {
        long n0 = 0, n1 = 1, nn = 0, x = 0, buf = 0;
        double max = 4*Math.pow(10,6);
        while(nn<=max) {
            nn = n0 + n1;
            n0 = n1;
            n1 = nn;
            if (nn % 2 == 0) {
                buf = nn;
                x += buf;
            }
        }
        System.out.println(x);
    }
}