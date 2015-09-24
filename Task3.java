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


    public ArrayList<Long> getDels(long num)
    {
        // ищем корень из исходного числа. В дальнейшем будем перебирать делители от 2 и до округленного значения корня исходного числа
        double numSqrt = java.lang.Math.round(java.lang.Math.sqrt(num));
        System.out.println("Округленное значение корня из исходного числа:" + numSqrt);
        ArrayList<Long> dels = new ArrayList();

        // число всегда делится на себя и на 1
        dels.add(num);
        dels.add((long) 1);

        long timestart=System.currentTimeMillis();
       for (double i = 2; i<=numSqrt; i++)
        {

            if(num%i==0)
            {
                dels.add((long) i);
                dels.add((long) (num/i));

            }
        }

        long timeend=System.currentTimeMillis();
        System.out.println("time:"+(timeend-timestart));
        return dels;
    }



    public void  testArg(Long num)
    {
        System.out.println("число для анализа:"+num);

        ArrayList<Long> dels =   this.getDels(num);
        sort(dels);
        for (int j =dels.size()-1; j > 0 ; j--)
        {
            if(isPrime((Long) dels.get(j)))
            {
                System.out.println("Максимальный делитель:"+dels.get(j));
                System.out.println("____________________________________");
                return;
            }
        }

    }

/*Пробовал запустить?
main method should be static
чтоб обратиться к методу класса изнутри нужно использовать this.testArg(num);
 */
        public void main(String[] args)

        {

                 long num = new Long("600851475143");
                 testArg(num);

            for (int i = 0; i < args.length; i++)
            {
                 num = Long.valueOf(args[i]);
                testArg(num);


            }





        }

}
