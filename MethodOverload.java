class Overload
{
    void calculate(int n,char ch)
     {
       if(ch=='s')
        {
          int a=n*n;
          System.out.println("The square of "+n +" is "+ a);
        }
        else
         {
           int a=n*n*n;
            System.out.println("The cube of "+n +" is "+ a);
         }
       }
     void calculate(int n,int m,char ch)
     { 
     if(ch=='p')
        {
          System.out.println("The product of "+n+" and "+m+" is "+(n*m));
        }
     else
      System.out.println("Sum of "+n+" and "+m+" is "+(n+m));
    }
   void calculate(String str1, String str2)
  {
   if(str1.equals(str2))
      System.out.println( "The two strings "+str1+" and "+str2+" are equal");
   else
    System.out.println("The two strings "+str1+" and "+str2+" not are equal");
   }

 }
class MethodOverload
{
 public static void main(String arg[])
  {
    Overload ov=new Overload();
    ov.calculate(6,'p');
    ov.calculate(6,4,'p');
    ov.calculate("Sarah","Reuben");
   }
}