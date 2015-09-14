/**
 * Created by user on 13.09.2015.
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.*;

public class Task3 {
    // проверка на простоту
    public boolean isPrime(String n){
        boolean res = false;
        BigInteger divider = new BigInteger("2");
        BigInteger num = new BigInteger(n);
        if(num.compareTo(divider)==0){
            res = true;
            return res;
        }
        while (divider.compareTo(num.divide(divider).add(BigInteger.ONE)) <= 0){
            if(num.mod(divider).equals(BigInteger.ZERO)){
                return res;
            }
            divider = divider.add(BigInteger.ONE);
        }
        res = true;
        return res;
    }
    // вывод делителей числа
    public ArrayList dividers(String n, boolean tmp){
        ArrayList dividers = new ArrayList();
        BigInteger divider = new BigInteger("2");
        BigInteger num = new BigInteger(n);
        while (divider.compareTo(num) <= 0) {
            if(num.mod(divider).equals(BigInteger.ZERO)) {
                if(tmp) {
                    if(isPrime(divider.toString())){
                        dividers.add(divider);
                    }
                    num = num.divide(divider);
                }
                else {
                    dividers.add(divider);
                }
            }
            divider = divider.add(BigInteger.ONE);
        }
        return dividers;
    }

    public static void main(String[] args) {
        Task3 ch = new Task3();
        ArrayList test = new ArrayList();
        long start = System.currentTimeMillis();
        System.out.println("#3 Dividers.");
        System.out.println("Time start: " + start);
        test = ch.dividers("600851475143", true);
        long stop = System.currentTimeMillis();
        System.out.println("Time stop: " + stop);
        System.out.println("Time diff: " + (stop - start));
        int size = test.size()-1;
        System.out.println("Resultat: " + test.get(size));
    }
}

