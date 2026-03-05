//Write a program to check the given number is even or odd using if 

class EvenOdd{
   public static void main(String[]args){
            int num = 40;
            String res = "ODD";
            if(num % 2 == 0)
            {
              res = "EVEN";
            }
            System.out.println(num+" is "+res);
 }
}