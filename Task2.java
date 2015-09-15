public class Task2{

     public static void main(String []args)
     {
      
       int count  = 4000000;
       long sum  = 0;
       int num = 0;
       int old1 = 0;
       int old2 =1;
       while( (old1 + old2) < count)   
       {
          
           num = old1 + old2;
           old2 = old1;
           old1 = num;
           sum  = (num%2==0)? sum + num:sum;
       }
     
     
        System.out.println(sum);
     }
}
