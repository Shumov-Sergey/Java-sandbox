/**
 * Created by marker on 17/09/2015.
 */
public class Task1 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i<=1000; i++) {
            if (i%3==0 | i%5==0){
                x += i;
            }
        }
        System.out.print(x);
    }
}
