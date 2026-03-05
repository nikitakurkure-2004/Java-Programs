//Write a Program to count the digit in given number
import java.util.Scanner;
class CountDigit{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
     int num = sc.nextInt();
    int temp = num;
    int count = 0;
    while(num != 0)
    {
      count++;
      num = num / 10;
    }
System.out.println("Count of the digit in "+temp+" is " +count);
 }
}