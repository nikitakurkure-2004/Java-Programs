//Write a program to print sum of natural number
import java.util.Scanner;
class SumOfNaturalNum{
 public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number");
      int num = sc.nextInt();
      System.out.println("Enter a endRange");
      int endRange = sc.nextInt();
      int sum = 0;

      while(num<=endRange)
      {
         sum = sum + num;
         num++;
      }
       System.out.println("Sum of "+num+" to "+endRange+" is "+sum);
    }
}