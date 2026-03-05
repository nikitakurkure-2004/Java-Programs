import java.util.Scanner;
class CheckVowel{
         public static void main(String[]args){
                        
                  Scanner sc = new Scanner(System.in);

                    System.out.println("Check the given alphabet is vowel or Not");
                    System.out.println("Enter a alphabet");
                     char ch = sc.next().charAt(0);

                     switch(ch)
                     {
                         case 'a' :
                         case 'e' : 
                         case 'i' :
                         case 'o' :
                         case 'u' :
                         case 'A' :
                         case 'E' :
                         case 'I' :
                         case 'O' :
                         case 'U' : System.out.println(ch +" is a vowel");
                                  break;
                         default : System.out.println(ch +" is Consonant");
                     }
 }
}

                     
 
