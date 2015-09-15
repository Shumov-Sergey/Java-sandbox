/**
 * Created by user on 14.09.2015.
 */
public class Task10 {

    public static void main(String[] args) {
        long res = 0;

        long start = System.currentTimeMillis();
        System.out.println("#10 SumSimpleNumbers.");
        System.out.println("Time start: " + start);
        for (long i = 2; i < 2000000; i++) {
            if(i == 10000){
                System.out.println(10000);
            }
            if(i == 100000){
                System.out.println(100000);
            }
            if(i == 500000){
                System.out.println(500000);
            }
            if(i == 1000000){
                System.out.println(100000);
            }
            if (Task7.isPrime(i)) {
                res+=i;
            }

        }
        long stop = System.currentTimeMillis();
        System.out.println("Time stop: " + stop);
        System.out.println("Time diff: " + (stop - start));
        System.out.println("Resultat: " + (res));
    }
}
