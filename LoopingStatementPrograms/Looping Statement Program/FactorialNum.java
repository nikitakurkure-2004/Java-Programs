//write a program to print factoial of a number
//0! = 1
//1! = 1 
import java.util.Scanner;
class FactorialNum{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    int fact = 1;
    int i = 1;
    while(i<=num)
    {
      fact = fact * i ;
       i++;
    }
    System.out.println("Factorial Of "+num+" is "+fact);
  }
}



