import java.util.Scanner;
// Complete the class below as sopecified above.
class ReverseGreet extends Thread
{
int num;
   ReverseGreet(int n)
   {
   num=n;
   }
  
  	public void run(){
   
     for(int i=num;i>=1;i--)
       {
        System.out.println("CodeQuotient Thread"+i);
       }
   	}
 
}
class Main{
	public static void main(String args[])
   	{
     Scanner ref = new Scanner(System.in);
	  int num = ref.nextInt();
      ReverseGreet thrd = new ReverseGreet(num);
      thrd.start();
   	}
}
