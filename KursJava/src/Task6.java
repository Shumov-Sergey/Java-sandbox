/**
 * Created by user on 14.09.2015.
 */
import java.math.*;
public class Task6 {
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

    public static void main(String[] args) {
        int sumSq;
        int SqSum;
        long start = System.currentTimeMillis();
        System.out.println("#6 SumSquare.");
        System.out.println("Time start: " + start);
        sumSq = sumSquare(100);
        SqSum = squareSum(100);
        long stop = System.currentTimeMillis();
        System.out.println("Time stop: " + stop);
        System.out.println("Time diff: " + (stop - start));
        System.out.println("Resultat: " + (SqSum - sumSq));
    }

}
