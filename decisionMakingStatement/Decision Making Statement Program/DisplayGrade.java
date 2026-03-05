//write a program to display grade

class DisplayGrade{
       public static void main(String[]args){
             int marks =94;
              if(marks >= 75 && marks <= 100)
              {
                 System.out.println("Student grade is distinct");
              }
              else if(marks >= 60 && marks <= 74)
              {
                 System.out.println("student grade is first Class");
              }
              else if(marks >=50 && marks <= 59)
              {
                System.out.println("Student grade is second class");
              }
              else if(marks >= 35 && marks <= 49)
              {
                System.out.println("student grade is pass");
              }
              else if(marks >= 0 && marks <= 35 )
              {
                System.out.println("student grade is fail");
              }
              else 
              {
                System.out.println("Invalid Input");
              }
 }
}

      

