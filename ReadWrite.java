import java.io.*;
import java.util.*;
public class ReadWrite
  {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
      int i;
      File f1=new File("D:\\OOPS\\write.txt");
      FileInputStream fin=new FileInputStream(f1);
      FileWriter myWriter = new FileWriter("D:\\OOPS\\write.txt"); 
 Scanner sc=new Scanner(System.in);
      System.out.println("Write a content to the files:");
      String a[]=new String[4];
      for ( i=0; i<4; i++)
      {
       a[i]=sc.nextLine();
       myWriter.write(a[i]+"\n");
      }
    myWriter.close();
    System.out.println(" The file content are:");
      do
      {
       
       i=fin.read();
       if (i !=-1)
       System.out.print((char)i);
       }while(i!=-1);
     fin.close();
   }
}