/**
 * Created by user on 10.09.2015.
 */
public class Task2 {
    public static void main(String[] args) {
        int previous = 1;
        int current = 2;
        int next = 0;
        long sum = 2;
        while (next < 4000000){
            next = previous + current;
            if (next > 4000000){
               break;
            }
            if (next%2 == 0){
                sum+=next;
            }

            previous = current;
            current = next;
        }
        System.out.println(sum);

    }
}
