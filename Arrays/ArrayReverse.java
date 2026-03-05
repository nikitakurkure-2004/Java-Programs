//write a program to reverse an array using a new array/ extra array
import java.util.Arrays;
class ArrayReverse
{
    public static void main(String[] args)
      {
          String[] ipl ={"CSK", "MI", "DC", "GT", "RCB"};
          System.out.println("Array : "+Arrays.toString(ipl));
         
          String[] res = new String[ipl.length];  
          /*int k = 0;
          for(int i=ipl.length-1; i>=0; i--)
          {
             res[k] = ipl[i];
             k++;
          }
          */
           int k=ipl.length-1;
           for(int i=0; i < ipl.length; i++,k--)
           {
               res[k] = ipl[i];
              
           }
          System.out.println("Reverse Array :" +Arrays.toString(res));
       }
}

        
          
          
           