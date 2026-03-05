//Write a program to check that given number is automorphic number or not
import java.util.Scanner;
class AutomorphicNumber{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   int num = sc.nextInt();
   int sqr = num * num;
   int temp = num ;
   int divisor = 1;
 
   while(num!=0)
   {
     divisor = divisor * 10;
     num = num /10;
   }
   if((sqr % divisor) == temp)
        System.out.println(temp+" is Automorphic Number");
   else 
        System.out.println(temp+" is not Automorphic Number");
   }
}