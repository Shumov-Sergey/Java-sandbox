//package com.company;


import java.util.ArrayList;

import static java.util.Collections.sort;

/**
 * Created by miroshnichenko on 22.09.2015.
 */
public class Task4 {


// проверка  - является ли число полиндромом. Разделяем число на разряды и переворачиваем
public boolean isPol(int a)
{

    int razr = (int) java.lang.Math.floor( java.lang.Math.log10(a)  )+1; // количество разрядов
    int m = a;
    int l = 0;

    for (int i = 0; i < razr; i++) {

        l = l*10 + m%10;
        m = (int) java.lang.Math.floor(m/10);

    }


    return a==l;  // равно ли исходное число перевернутому
}

   public void getListPol()
   {
       //proizv-транслит всегда плохо, multiply-хорошо
       ArrayList<Integer> proizv = new ArrayList();  // тут хранятся произведения множителей

       long timestart=System.currentTimeMillis();

       // так как в условии только 3-х значные числа
       for (int i = 1000; i > 99 ; i--) {

           for (int j = i; j > 99 ; j--) {

               if(isPol(i * j))
               {
                   proizv.add(i*j);
               }

           }
       }
       sort(proizv);  // сортируем значения по возрастанию
       long timeend=System.currentTimeMillis();
       System.out.println("time:" + (timeend - timestart));

       System.out.println("Самый большой: "+ proizv.get(proizv.size()-1));  
   }


//Тут тоже не запустится
    public void main()

    {
        this.getListPol();
    }


    }
