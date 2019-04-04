import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int num , sum = 0;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

       System.out.println( sum);
    }                 
}