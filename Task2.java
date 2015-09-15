/**
 * Created by Anton on 15.09.2015.
 */
public class Task2 {

    public static void main(String args[]) {

        int tmp = 0;
        int prevNum = 0;
        int currNum = 1;
        int sum = 0;

        while (prevNum + currNum < 4000000) {

            tmp = currNum;
            currNum += prevNum;
            prevNum = tmp;

            if(currNum%2 == 0) {sum += currNum;}
        }

        System.out.println(sum);
    }
}
