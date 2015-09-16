/**
 * Created by user on 13.09.2015.
 */

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.*;

public class Task3 extends Task {

    private long start;
    private long stop;

    public void setStart(){
        start = System.currentTimeMillis();
    }

    public long getStart(){
        return start;
    }

    public void setStop(){
        stop = System.currentTimeMillis();
    }

    public long getStop(){
        return stop;
    }

    public long getProcessTime(){
        return (stop - start);
    }
    // проверка на простоту
    public static boolean isPrime(String n){
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
    public static ArrayList dividers(String n, boolean tmp){
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

    public void run(){

        File file = new File(System.getProperty("user.dir")+"\\src\\Task3.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            Task3 t = new Task3();
            ArrayList test = new ArrayList();
            t.setStart();
            try {
                out.println("#3 Dividers.");
                out.println("Time start: " + t.getStart());
                test = dividers("600851475143", true);
                t.setStop();
                out.println("Time stop: " + t.getStop());
                out.println("Time diff: " + t.getProcessTime());
                int size = test.size() - 1;
                out.println("Resultat: " + test.get(size));
            }finally{
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}

