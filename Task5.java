package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by miroshnichenko on 23.09.2015.
 */
public class Task5 {



    public ArrayList<Integer> globalDels = new ArrayList();




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
            Такой вопрос, какое обоснование выносить globalDels в класс, можно же сделать так же определить его в функции, как localDels?
            И еще, у каждого метода свое названчение. getDelis в предыдущей задаче он выполнял одно, в этой уже другое.
            Лучше определить еще один метод, который будет выполнять код ниже
         */
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


    //и тут
    public void run(String[] args)

    {

        // при написании алгоритма использовалось http://math-prosto.ru/?page=pages/find_nod_and_nok/find_nok.php .
        long timestart=System.currentTimeMillis();
        // список делителей для которых ищем значение
        //тут нужен this
        for (int i = 0; i < args.length; i++) {
            getDelis(Integer.valueOf(args[i]));
        }


        int s = 1;
        //а тут this убрать, если хочешь обратиться к этому свойству, придется создать новый объект класса Task5
        // последовательно перемножаем все делители
        for (int i = 0; i < this.globalDels.size(); i++) {

            s = s * this.globalDels.get(i);
        }

        long timeend=System.currentTimeMillis();
        System.out.println("time:" + (timeend - timestart));

        System.out.println("Наибольшее общее кратное:" + s);


    }
}
