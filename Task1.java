public class Task1{
	 public static void main(String []args)
     {
       int count  = 1000;
       int sum  = 0;
       for(int i=0;i<count; i++)
       {
           sum += ((i%5==0)||(i%3==0))? i:0;
           
       }
     
        System.out.println(sum);
     }
}
