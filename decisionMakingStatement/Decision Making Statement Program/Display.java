//write a program to display subject  year and stream wise

import java.util.Scanner;
class Display{
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in); 
         System.out.print("Enter a year:");
         int year = sc.nextInt();
         String stream = " ";
         
         switch(year)
         {
            case 1 : {
                     System.out.println("Year 1 Subjects (Common for all streams):");
                     System.out.println("Engineering Mathematics");
                     System.out.println("Physics");
                     System.out.println("Chemistry");
                     System.out.println("Basic Programming");
                     }
                     break;
                    
  
                    
            case 2 : {

                      System.out.println("CSE");
                      System.out.println("IT");
                      System.out.println("AI");
                      System.out.println("MECH");
                      System.out.println("ELECTRIC");
                      System.out.println("CIVIL");

                      sc.nextLine();
                      System.out.print("Enter a stream:"); 
                      stream = sc.nextLine().toLowerCase();
         
                           switch(stream)
                              {
                                 case "cse" : {
                                                 System.out.println("CSE – Second Year Subjects");
                                                 System.out.println("CS201  Data Structures");
                                                 System.out.println("CS202  Object Oriented Programming");
                                                 System.out.println("CS203  Database Management System");
                                                 System.out.println("CS204  Computer Organization");
                                                 System.out.println("CS205  Discrete Mathematics");
                                                 break;
                                              }
                                 case "it" : {
                                              System.out.println("IT – Second Year Subjects");
                                              System.out.println("IT201  Data Structures");
                                              System.out.println("IT202  Web Technology");
                                              System.out.println("IT203  Database Management System");
                                              System.out.println("IT204  Computer Networks");
                                              System.out.println("IT205  Operating Systems");
                                              break;
                                              }
                                 case "ai" : {
                                               System.out.println("AI – Second Year Subjects");
                                               System.out.println("AI201  Python Programming");
                                               System.out.println("AI202  Linear Algebra");
                                               System.out.println("AI203  Data Structures");
                                               System.out.println("AI204  Probability & Statistics");
                                               System.out.println("AI205  Artificial Intelligence Basics");
                                               break;
                                              }
                                 case "mech" : {
                                              System.out.println("MECH – Second Year Subjects");
                                              System.out.println("ME201  Thermodynamics");
                                              System.out.println("ME202  Strength of Materials");
                                              System.out.println("ME203  Manufacturing Process");
                                              System.out.println("ME204  Engineering Mechanics");
                                              System.out.println("ME205  Fluid Mechanics");
                                              break;
                                               }
                                case "electric" : {
                                                  System.out.println("ELECTRICAL – Second Year Subjects");
                                                  System.out.println("EE201  Circuit Theory");
                                                  System.out.println("EE202  Electrical Machines");
                                                  System.out.println("EE203  Control Systems");
                                                  System.out.println("EE204  Power Systems");
                                                  System.out.println("EE205  Measurements & Instrumentation");
                                                 break;
                                                  }
                                 case "civil" : { 
                                               System.out.println("CIVIL – Second Year Subjects");
                                               System.out.println("CE201  Engineering Mathematics");
                                               System.out.println("CE202  Building Materials");
                                               System.out.println("CE203  Strength of Materials");
                                               System.out.println("CE204  Surveying");
                                               System.out.println("CE205  Fluid Mechanics");
                                               break;
                                              }
                                  default: System.out.println("invalid stream");
                                              
                              }
                           

   
                       }  
                   break;

             case 3: {

                          switch(stream)
                              {
                                 case "cse" : {
                                                   System.out.println("CSE – Third Year Subjects"); 
                                                   System.out.println("CS301  Operating Systems");
                                                   System.out.println("CS302  Computer Networks");
                                                   System.out.println("CS303  Software Engineering");
                                                   System.out.println("CS304  Theory of Computation");
                                                   System.out.println("CS305  Web Technologies");
                                                   break;
                                              }
                                 case "it" : {
System.out.println("IT – Third Year Subjects");
        System.out.println("IT301  Operating Systems");
        System.out.println("IT302  Computer Networks");
        System.out.println("IT303  Software Engineering");
        System.out.println("IT304  Cloud Computing");
        System.out.println("IT305  Cyber Security");
        break;
}
                                 case "ai" : {
                                              System.out.println("AI – Third Year Subjects");
        System.out.println("AI301  Machine Learning");
        System.out.println("AI302  Deep Learning");
        System.out.println("AI303  Natural Language Processing");
        System.out.println("AI304  Data Mining");
        System.out.println("AI305  Computer Vision");
        break;
                                              }
                                 case "mech" : {
                                             System.out.println("MECH – Third Year Subjects");
        System.out.println("ME301  Heat Transfer");
        System.out.println("ME302  Design of Machine Elements");
        System.out.println("ME303  Dynamics of Machinery");
        System.out.println("ME304  Metrology");
        System.out.println("ME305  CAD / CAM");
        break;
                                               }
                                case "electric" : {
                                                  System.out.println("ELECTRICAL – Third Year Subjects");
        System.out.println("EE301  Power Electronics");
        System.out.println("EE302  Electrical Drives");
        System.out.println("EE303  Microcontrollers");
        System.out.println("EE304  Power System Analysis");
        System.out.println("EE305  Digital Signal Processing");
        break;
                                                  }
                                 case "civil" : { 
                                               System.out.println("CIVIL – Third Year Subjects");
        System.out.println("CE301  Structural Analysis");
        System.out.println("CE302  Geotechnical Engineering");
        System.out.println("CE303  Transportation Engineering");
        System.out.println("CE304  Environmental Engineering");
        System.out.println("CE305  Design of RCC Structures");
        break;
                                              }
                                  default: System.out.println("invalid stream");
                                              
                              }

   
                       }  break;
              case 4 : {
                           switch(stream)
                              {
                                 case "cse" : {
                                                System.out.println("CSE – Fourth Year Subjects");
        System.out.println("CS401  Artificial Intelligence");
        System.out.println("CS402  Machine Learning");
        System.out.println("CS403  Cloud Computing");
        System.out.println("CS404  Big Data Analytics");
        System.out.println("CS405  Project Work");
        break;
                                              }
                                 case "it" : {
                                              System.out.println("IT – Fourth Year Subjects");
        System.out.println("IT401  Cloud Computing");
        System.out.println("IT402  Big Data");
        System.out.println("IT403  Information Security");
        System.out.println("IT404  DevOps");
        System.out.println("IT405  Project Work");
        break;
                                              }
                                 case "ai" : {
                                               System.out.println("AI – Fourth Year Subjects");
        System.out.println("AI401  Advanced Machine Learning");
        System.out.println("AI402  Deep Learning Applications");
        System.out.println("AI403  Natural Language Processing");
        System.out.println("AI404  Robotics");
        System.out.println("AI405  Project Work");
        break;
                                              }
                                 case "mech" : {
                                             System.out.println("MECH – Fourth Year Subjects");
        System.out.println("ME401  Automobile Engineering");
        System.out.println("ME402  Finite Element Analysis");
        System.out.println("ME403  Renewable Energy Systems");
        System.out.println("ME404  Industrial Engineering");
        System.out.println("ME405  Project Work");
        break;
                                               }
                                case "electric" : {
                                                 System.out.println("ELECTRICAL – Fourth Year Subjects");
        System.out.println("EE401  Smart Grid");
        System.out.println("EE402  Power Quality");
        System.out.println("EE403  Renewable Energy Systems");
        System.out.println("EE404  Electric Vehicles");
        System.out.println("EE405  Project Work");
        break;
                                                  }
                                 case "civil" : { 
                                             System.out.println("CIVIL – Fourth Year Subjects");
        System.out.println("CE401  Advanced Structural Design");
        System.out.println("CE402  Construction Planning & Management");
        System.out.println("CE403  Environmental Impact Assessment");
        System.out.println("CE404  Remote Sensing & GIS");
        System.out.println("CE405  Project Work");
        break;
                                              }
                                  default: System.out.println("invalid stream");
                                              
                              }

   
                       }  break;
                         

         }
     }
 }
