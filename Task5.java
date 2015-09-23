package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by miroshnichenko on 23.09.2015.
 */
public class Task5 {

    public ArrayList<Integer> a1 = new ArrayList();
    public ArrayList<Integer> a3 = new ArrayList();


    public boolean isPrime(long num)
    {
        double nn =  java.lang.Math.round(java.lang.Math.sqrt(num));
        boolean isPrime = true;

        for (int i = 2; i < nn; i++)
        {
            if((num%i)==0)
            {
                isPrime = false;
                return isPrime;
            }

        }
        return  isPrime;
    }



    public void getDelis( int num)
    {
        int a = 0;
        while (a<num)
        {
            a = a+1;
            if((num%a==0)&&(isPrime(a)))
            {
             //   System.out.println(a);
                a1.add(a);
                num = num/a;
                a = 1;
            }


        }


       int i = 0;

        for (int j = 0; j < a1.size(); j++) {

            if(Collections.frequency(a3,a1.get(j))<Collections.frequency(a1,a1.get(j)))
            {
              int b = a1.get(j);// (int) Math.pow(a1.get(j),(Collections.frequency(a1,a1.get(j))-Collections.frequency(a3,a1.get(j))));
                a3.add(b);
            }

        }
        a1.clear();
    }



    public static void main(String[] args)

    {

        Task5 m = new Task5();
        long timestart=System.currentTimeMillis();
        for (int i = 2; i < 20; i++) {
            m.getDelis(i);
        }


        int s = 1;
        for (int i = 0; i < m.a3.size(); i++) {

            s = s * m.a3.get(i);
        }

        long timeend=System.currentTimeMillis();
        System.out.println("time:" + (timeend - timestart));

        System.out.println("s:" + s);


    }
}
