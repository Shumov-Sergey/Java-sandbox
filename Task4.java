/**
 * Created by Anton on 23.09.2015.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
    //Аналогично
    public static ArrayList<Integer> palindromeList = new ArrayList();

    public static boolean isPalindrome(int num) {

        String str1 = Integer.toString(num);
        String str2 = new StringBuffer(str1).reverse().toString();

        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }

    }

    public static void findAllPalindroms() {

        for(int i = 999; i > 99; i--) {
            for(int j = i; j > 99; j--) {

                int num = i*j;

                if(isPalindrome(num)) {
                    palindromeList.add(num);
                }

            }
        }

    }

    public static int getMaxPalindrome() {

        Collections.sort(palindromeList);
        return palindromeList.get(palindromeList.size() - 1);

    }

    public static void main(String args[]) {
        System.out.println("Задача #4");
        long startTime = System.currentTimeMillis();
        System.out.println("Время старта: " + startTime + " мс");
        System.out.println("Промежуточные результаты:");
        findAllPalindroms();
        long endTime = System.currentTimeMillis();
        System.out.println("Время окончания: " + endTime + " мс");
        System.out.println("Длительность расчета: " + (endTime - startTime) + " мс");
        System.out.println("Результат: " + getMaxPalindrome());
    }
}
