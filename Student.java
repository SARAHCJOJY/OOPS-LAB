import java.util.Scanner;
class stud
{
 
 String name;
 int age;
 String place;
 String co;
 int m1,m2,m3;
 Scanner sc=new Scanner(System.in);
 void read()
 {
  System.out.println("Enter the name:");
  name=sc.nextLine();
  System.out.println("Enter the Age:");
  age=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter the course:");
  co=sc.nextLine();
  System.out.println("Enter the place:");
  place=sc.nextLine();
 }
 void total()
 {
  int total=0;
  System.out.println("Enter the three subject mark:");
  m1=sc.nextInt();
  m2=sc.nextInt();
  m3=sc.nextInt();
  total=m1+m2+m3;
  System.out.println("The total mark of the student  is:"+total);
 }
 void display()
 {
   
  System.out.println("The name is:"+name);
  System.out.println("The Age is:"+age);
  System.out.println("The Place is:"+place);
  System.out.println("The Course is:"+co);
  
}
}
class Student
{
 public static void main(String[] args)
  {
   stud st=new stud();
   st.read();
   st.total();
   st.display();
  }
}