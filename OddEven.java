import java.io.*;
import java.util.Scanner;
public class OddEven
 {
   public static void main(String args[])
    { 
      int a[]=new int[5];
     try
      {
       FileWriter f1=new FileWriter("D:\\OOPS\\odd.txt");
       FileWriter f2=new FileWriter("D:\\OOPS\\even.txt");
        FileWriter oe = new FileWriter("D:\\OOPS\\oddeven.txt");
       Scanner sc=new Scanner(System.in);
       System.out.println(" enter any 5 no.s");
       for (int i=0; i<5; i++)
        {
          a[i]=sc.nextInt();
         oe.write(a[i]+"\n");
        }
        oe.close();
        System.out.println("Successfully wrote to the file:");
        String s;
        FileReader fr=new FileReader("D:\OOPS\oddeven.txt"); 
        BufferedReader br=new BufferedReader(fr);
       while((s=br.readLine())!=null)
        {
         int c=Integer.parseInt(s);
          if(c%2 ==0)
             f2.write(c+"\n");
          else
            f1.write(c+"\n");
            
         }
         f1.close();
         f2.close();
         fr.close();
    
      }
     catch (IOException e)
      { 
        System.out.println("An error occurred."); 
      }
   }
}