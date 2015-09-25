/**
 * Created by Anton on 21.09.2015.
 */
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.*;

public class Task3 {

    public static boolean isPrime(long n) {

        if ((n == 1)||(n == 2)||(n == 3)) {
            return true;
        }

        for (long i = 3; i < round(sqrt(n)); i = i + 2) {

            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static ArrayList<Long> findAllDivisors(long num) {

        ArrayList<Long> divisorsList = new ArrayList();

        long startTime = System.currentTimeMillis();
        System.out.println("Время старта: " + startTime + " мс");

        long limit = round(sqrt(num));

        for (long i = 2; i < limit; i++) {

            if(num%i == 0) {
                divisorsList.add(i);
                divisorsList.add(num/i);
            }
        }

        System.out.println("Промежуточные результаты:");

        long endTime = System.currentTimeMillis();
        System.out.println("Время окончания: " + endTime + " мс");
        System.out.println("Длительность расчета: " + (endTime - startTime) + " мс");

        return divisorsList;
    }

    public static void main(String args[]) {

        System.out.println("Задача #3");

        long num = new Long("600851475143");
        ArrayList<Long> divisorsList = findAllDivisors(num);

        Collections.sort(divisorsList);

        for (int i = divisorsList.size() - 1; i > 0; i--) {
            long divisor = divisorsList.get(i);
            if(isPrime(divisor)){
                System.out.println("Результат: " + divisor);
                break;
            }
        }

    }
}
