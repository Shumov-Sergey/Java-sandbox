package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by miroshnichenko on 23.09.2015.
 */
public class Task5 {
    /*
    a1 есть, a3 есть, куда делось a2?
    Из таких названий ничего не понятно
    */
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


    //Аналогичный комментарий, как к задаче 3
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
        //Как это работает?
        for (int j = 0; j < a1.size(); j++) {

            if(Collections.frequency(a3,a1.get(j))<Collections.frequency(a1,a1.get(j)))
            {
              int b = a1.get(j);// (int) Math.pow(a1.get(j),(Collections.frequency(a1,a1.get(j))-Collections.frequency(a3,a1.get(j))));
                a3.add(b);
                //можно так a3.add(a1.get(j));
            }

        }
        a1.clear();
    }


    /*
        К сожалению, совершенно не понял, как это работает.
        Утонул в a,a1,a3,m,n,nn,s.......
        В первых двух задачах мне больше нравились именования
    */
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
