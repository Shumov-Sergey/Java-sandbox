/**
 * Created by user on 14.09.2015.
 */
import java.math.BigInteger;

public class Task7 {

    // проверка на простоту
    public static boolean isPrime(long n){
        boolean res = false;

        if(n == 2){
            res = true;
            return res;
        }
        for (long i = 2; i <= n/2; i++){
            if(n%i == 0){
                return res;
            }
        }
        res = true;
        return res;
    }

    public static void main(String[] args) {
        int count = 0;
        int res = 0;

        long start = System.currentTimeMillis();
        System.out.println("#7 SimpleNumbers.");
        System.out.println("Time start: " + start);
        for(int i = 2; i < 1000000000; i++){
            if(isPrime(i)){
                count+=1;
            }
            if (count == 10001){
                res = i;
                break;
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time stop: " + stop);
        System.out.println("Time diff: " + (stop - start));
        System.out.println("Resultat: " + (res));
    }
}
