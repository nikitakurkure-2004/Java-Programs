//Write a program to print 1 to 5 natural numbers
import java.util.Scanner;
class NaturalNumPrint{
 public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number");
       int num = sc.nextInt();
       System.out.print("Enter a endrange");
       int endRange = sc.nextInt();
  
      while(num <= endRange)
      {
          System.out.println(num);
          num++;
      }
   }
}