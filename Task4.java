package com.company;


import java.util.ArrayList;

import static java.util.Collections.sort;

/**
 * Created by miroshnichenko on 22.09.2015.
 */
public class Task4 {

    public ArrayList<Integer> aaa = new ArrayList();

    public boolean isPol(int a)
    {

    int razr = (int) java.lang.Math.floor( java.lang.Math.log10(a)  )+1;
/*
    int delta1 =(int) java.lang.Math.floor(razr/2);
    double del1 = (razr%2==0)? delta1:delta1+1;
    double del2 = delta1;
    del1 = java.lang.Math.pow(10,del1);
    del2 = java.lang.Math.pow(10,del2);
    double leftP = java.lang.Math.floor(a/del1);
    double rightP = a%del2;

    System.out.println(leftP+" "+rightP);
  */
   int m = a;
    int l = 0;

    for (int i = 0; i < razr; i++) {

        l = l*10 + m%10;
        m = (int) java.lang.Math.floor(m/10);

    }


    return a==l;
}
//Аналогичный комментарий, как к задаче 3
   public void getListPol()
   {

       int pol = 0;
       long timestart=System.currentTimeMillis();
       for (int i = 1000; i > 99 ; i--) {

           for (int j = i; j > 99 ; j--) {

               if(isPol(i * j))
               {
                   aaa.add(i*j);
               }

           }
       }
       sort(aaa);
       long timeend=System.currentTimeMillis();
       System.out.println("time:" + (timeend - timestart));

       System.out.println("Самый большой: "+ aaa.get(aaa.size()-1));
   }


}

//А где main()?