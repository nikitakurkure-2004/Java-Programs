//write a program to check that gioven number is automorphic number or not
class AutoMorphicNumber{
 public static void main(String[]args){
           int num = 83;
           int res = num * num;
           int lastDigit = res % 10;

           if(lastDigit == num)
           {
             System.out.println("automorphic number");
           }
           else
           {
              System.out.println("Number is not automorphic");
           }
 }
}