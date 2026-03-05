//write a program without using new array/extra array 
import java.util.Arrays;
class ArrayReversing
{
     public static void main(String[] args)
       {
           String[] ipl={"csk", "MI", "DC", "GT", "RCB"};
           System.out.println("Array : " +Arrays.toString(ipl));

           int k = ipl.length-1;
           for(int i = 0; i<ipl.length/2; i++)
           {
              String temp;
              temp = ipl[i];
              ipl[i] = ipl[k];
              ipl[k] = temp;
              k--;
           }
           System.out.println("Reverse Array :"+Arrays.toString(ipl));
        }
}

           