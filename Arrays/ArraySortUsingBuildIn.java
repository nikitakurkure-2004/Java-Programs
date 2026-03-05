//write a program to sorting an array using build in function
import java.util.Arrays;
class ArraySortUsingBuildIn
{
         public static void main(String[]args)
           
             {
                  int[] arr = {10, 30, 20, 40};

                  for(int i = 0; i<arr.length; i++)
                   {
                    for(int j = i+1; j<arr.length; j++)
                        {
                           if(arr[i] > arr[j])
                             {
                                 int temp;
                                 temp = arr[i];
                                 arr[i] = arr[j];
                                 arr[j] = temp;
                              }
                        }
                   }
                     
                System.out.println("Sorted Array : "+Arrays.toString(arr));
             }
}
                   
     