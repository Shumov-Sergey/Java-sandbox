/**
 * Created by User on 29.11.2015.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 1, b = 1, fib, sum = 0;
        while ((fib = a + b) < 4000000) {
            a = b;
            b = fib;
            if (fib % 2==0){ sum += fib;
            }
        }

        System.out.println(sum);

    }
}


