/**
 * Created by user on 10.09.2015.
 */
public class Task2 {
    public static void main(String[] args) {
        int pred = 1;
        int tek = 2;
        int sled = 0;
        long sum = 2;
        while (sled < 4000000){
            sled = pred + tek;
            if (sled > 4000000){
               break;
            }
            if (sled%2 == 0){
                sum+=sled;
            }

            pred = tek;
            tek = sled;
        }
        System.out.println(sum);

    }
}
