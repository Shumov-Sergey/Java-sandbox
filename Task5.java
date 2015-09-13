/**
 * Created by user on 13.09.2015.
 */
public class Task5 {
    // проверка, делится ли число на все делители
    public static boolean smallNum(long n, int div){
        boolean res = false;
        int count = 0;
        for (int i = 2; i <= div; i++)
        {
            if (n % i == 0){
                count+=1;
            }
            else{
                break;
            }
        }
        if (count == div-1){
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {

        long res = 0;
        long start = System.currentTimeMillis();
        System.out.println("#5 SmallNumber.");
        System.out.println("Time start: " + start);
        for (long i = 20; i < 1000000000; i+=20)
        {
            if (smallNum(i, 20)){
                res = i;
                break;
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time stop: " + stop);
        System.out.println("Time diff: " + (stop - start));
        System.out.println("Resultat: " + res);
    }
}
