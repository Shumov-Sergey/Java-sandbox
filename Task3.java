package com.company;

import java.util.ArrayList;
import static java.util.Collections.*;

/**
 * Created by miroshnichenko on 22.09.2015.
 */
public class Task3
{

    public ArrayList<Long> aaa = new ArrayList();

    /** Определение простоты */
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


    public void getDels(long num)
    {
        double nn = java.lang.Math.round(java.lang.Math.sqrt(num));
        System.out.println("nn:" + nn);
        aaa.add(num);
        aaa.add((long) 1);
        long timestart=System.currentTimeMillis();
       for (double i = 2; i<=nn; i++)
 //       for (double i = 2; i<=num; i++)
        {

            if(num%i==0)
            {
               aaa.add((long) i);
               aaa.add((long) (num/i));

            }
        }

        long timeend=System.currentTimeMillis();
        System.out.println("time:"+(timeend-timestart));
    }




        public static void main(String[] args)

        {

            Task3 m = new Task3();
            long a = new Long("600851475143");
            //System.out.print(  m.isPrime( a ));

            m.getDels(a);

            sort(m.aaa);
            for (int i =m.aaa.size()-1; i > 0 ; i--)
            {
                if(m.isPrime((Long) m.aaa.get(i)))
                {
                    System.out.println("Максимальный делитель:"+m.aaa.get(i));
                    return;
                }
            }





        }

}
