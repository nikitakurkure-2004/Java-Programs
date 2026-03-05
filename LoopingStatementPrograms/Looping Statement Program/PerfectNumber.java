//Write a program to check given number is perfect number or not

import java.util.Scanner;
class PerfectNumber{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Number");
   int num = sc.nextInt();
   int i = 1;
   int sum = 0;
    
   while(i<=num/2)
  {
    if(num % i == 0)
    {
       sum = sum + i;
    }
  i++;
  }
 if(sum == num)
     System.out.println(num+" is Perfect Number");
 else 
    System.out.println(num+"is not a perfect Number");

  }
}
    