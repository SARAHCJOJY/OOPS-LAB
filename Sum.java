import java.util.Scanner;
class Sum
{
public static void main(String arg[])
 {
   int n;
   int sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the numbers:");
   n=sc.nextInt();
   for(int i=0; i<=n;i++)
    {
     sum=sum+i;
     
    }
   System.out.println("Sum of  numbers is:"+sum);
  }
}
   