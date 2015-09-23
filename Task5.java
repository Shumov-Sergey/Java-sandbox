import java.util.ArrayList;
import java.util.Collections;
import static java.lang.Math.*;
/**
 * Created by Anton on 23.09.2015.
 */
public class Task5 {

    public static ArrayList<Integer> factorList = new ArrayList<>();

    public static ArrayList<Integer> toFactor(int number) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 2;

        while(i <= number) {

            if(number%i == 0) {
                number /= i;
                result.add(i);
            }
            else{
                i++;
            }

        }

        return result;
    }

    public static void addFactorList(ArrayList<Integer> factor){

        for (int i = 0; i < factor.size(); i++) {

            int count1 = Collections.frequency(factorList, factor.get(i));
            int count2 = Collections.frequency(factor, factor.get(i));
            int diff = count1-count2;

            while(diff < 0) {
                factorList.add(factor.get(i));
                diff++;
            }
        }

    }

    public static long getResult(int number) {

        for(int i = 1; i <= number; i++) {

            ArrayList<Integer> test = toFactor(i);
            addFactorList(test);
        }

        long result = 1;
        for(int i = 0; i < factorList.size(); i++) {

            result *= factorList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Задача #5");
        long startTime = System.currentTimeMillis();
        System.out.println("Время старта: " + startTime + " мс");

        long result = getResult(20);

        System.out.println("Промежуточные результаты:");
        long endTime = System.currentTimeMillis();
        System.out.println("Время окончания: " + endTime + " мс");
        System.out.println("Длительность расчета: " + (endTime - startTime) + " мс");
        System.out.println("Результат: " + result);


    }
}
