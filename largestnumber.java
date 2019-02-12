import java.util.*;
class Main {
  public static void main(String[] args) {
    int a,b,c;
    Scanner num=new Scanner (System.in);
    System.out.println("Enter the numbers");
   a=num.nextInt();
   b=num.nextInt();
   c=num.nextInt();
   if((a>b) && (a>c)){
     System.out.println("a is largest");
   }
   else if ((b>a) && (b>c))
   {
     System.out.println("b is largest");
   }
   else
   {
     System.out.println("c is largest");
   }
  }
}
