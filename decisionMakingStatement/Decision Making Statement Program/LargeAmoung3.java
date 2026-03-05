//write a program to find the largest number amoung 3

class LargeAmoung3{
  public static void main(String[]args){
           int num1 = 10;
           int num2 = 20;
           int num3 = 30;
        
           if(num1 > num2 && num1 > num3)
           {
              System.out.println(num1+" is largest Number");
           }
           else if(num2 > num3)
           {
              System.out.println(num2+" is Largest Number");
           }
           else
           {
              System.out.println(num3+"is Largest Number");
           }
 }
}