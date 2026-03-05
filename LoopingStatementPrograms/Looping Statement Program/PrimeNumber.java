//Write a program to check that given number is prime or not
import java.util.Scanner;
class PrimeNumber{
 public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Number ");
     int num = sc.nextInt();

     int count = 0;
     int i =1;
    
    while(i <= num)
    {
       if(num % i == 0)
       {
          count++;
       } i++;
    }
     
    if(count == 2)
       System.out.println(num+" is Prime Number ");
    else
       System.out.println(num+" is not a Prime Number");
  }
}
       