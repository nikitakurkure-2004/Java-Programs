//To fetch an array length
import java.util.Scanner;
class Array {

        public static void main(String[]args){
                System.out.println("Length of an array");
                int[] arr1 = { 1, 2, 3, 4};
                System.out.println(arr1);
                System.out.println(arr1.length);

                int[] arr2 = new int[6];
                System.out.println(arr2);
                System.out.println(arr2.length);

               System.out.println("Accesing the value");
               char[] arr3 ={'a', 'e', 'i', 'o', 'u'};
               System.out.println(arr3[0]);
               System.out.println(arr3[1]);
               System.out.println(arr3[2]);
               System.out.println(arr3[3]);
               System.out.println(arr3[4]);
             
               System.out.println("index presnt in array");
               for(int index = 0; index < arr3.length; index++)
               {      
                    System.out.println(index);      
               }
               
               System.out.println("Value presnt in array");
               for(int index = 0; index < arr3.length; index++)
               {      
                    System.out.println(arr3[index]);      
               }

              System.out.println("Assigning the value in an array");
              int[] arr4= new int[] {10,20,30,40,50,60,70,80,90,100};
              for(int i = 0; i< arr4.length; i++)
              {
                 System.out.println(arr4[i]);
              }
              
             System.out.println("Assigning the value in an array");
             int[] arr5 = new int[6];
             arr5[0] = 34;
             arr5[1] = 23;
             arr5[2] = 67;
           

             for(int i = 0; i < arr5.length; i++)
             {
                System.out.println(arr5[i]);

             }
              
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter a array size");
             //Accepting size of an array
             int[] arr6 = new int[sc.nextInt()];

             System.out.println("Enter "+arr6.length+" integer value");
             for(int index = 0; index < arr6.length; index++)
             {
                  arr6[index] = sc.nextInt();
             }
        
            System.out.println("acccepting the values Of an array");
            for(int i = 0; i< arr6.length; i++)
            {
                   System.out.println(arr6[i] + " ");
            }

      
      }

}