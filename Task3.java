/**
 * Created by Anton on 21.09.2015.
 */
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.*;

public class Task3 {

    static ArrayList divisorsList = new ArrayList();

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

    public static void findAllDivisors(long num) {

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
    }

    public static void main(String args[]) {

        System.out.println("Задача #3");

        long num = new Long("600851475143");
        findAllDivisors(num);

        Collections.sort(divisorsList);

        for (int i = divisorsList.size() - 1; i > 0; i--) {
            long divisor = (long)divisorsList.get(i);
            if(isPrime(divisor)){
                System.out.println("Результат: " + divisor);
                break;
            }
        }

    }
}
