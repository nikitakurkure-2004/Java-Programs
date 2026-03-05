//Write a program to extract the digit in the given number and print those digit

import java.util.Scanner;
class ExtractAndPrintDigit{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    int num = sc.nextInt();
    while(num!=0)
    {
       int lastDigit = num % 10;
       System.out.print(lastDigit);
       num = num / 10;
    }
  }
}
  
