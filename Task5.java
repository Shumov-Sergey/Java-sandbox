package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by miroshnichenko on 23.09.2015.
 */
public class Task5
implements   Runnable
{


    Task5(String[] args)
    {
       this.mnoz = args.clone();

    }
    
    public ArrayList<Integer> globalDels = new ArrayList();
    String[] mnoz;



    // Проверяем является ли полученное число простым
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



    // получение делителей исходного числа
    public void getDelis( int num)
    {


        ArrayList<Integer> localDels = new ArrayList();

        // составляем список делителей числа
        int tmp = 0;  // временная переменная.
        while (tmp<num)
        {
            tmp = tmp+1;
            if((num%tmp==0)&&(isPrime(tmp)))
            {
                localDels.add(tmp);
                num = num/tmp;
                tmp = 1;
            }


        }


        /*
            Последовательно перебираем все значения массива простых  делителей
            Сравниваем с глобальным массивом.
            Если локальный массив не входит в глобальный массив - добавляем в глобальный массив недостающие значения
         */

        for (int j = 0; j < localDels.size(); j++) {

            if(Collections.frequency(globalDels,localDels.get(j))<Collections.frequency(localDels,localDels.get(j)))
            {
                globalDels.add(localDels.get(j));
            }

        }
        localDels.clear();
    }



    public  void run()
    {



        // при написании алгоритма использовалось http://math-prosto.ru/?page=pages/find_nod_and_nok/find_nok.php .
        long timestart=System.currentTimeMillis();
        // список делителей для которых ищем значение

        for (int i = 0; i < mnoz.length; i++) {
            this.getDelis(Integer.valueOf(mnoz[i]));
        }


        int s = 1;
        // последовательно перемножаем все делители
        for (int i = 0; i < this.globalDels.size(); i++) {

            s = s * this.globalDels.get(i);
        }

        long timeend=System.currentTimeMillis();
        System.out.println("time:" + (timeend - timestart));

        System.out.println("Наибольшее общее кратное:" + s);


    }


}
