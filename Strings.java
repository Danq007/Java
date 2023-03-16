import java.util.Scanner;

/**
    * Strings
    */
   public class Strings {
   
    public static void main(String[] args) {
        // String studentName= "Alex";
        // double studentGpa=1.9;

        // studentName="Alice";

        //ask the user for a positive value
        Scanner in = new Scanner(System.in);// to run something in the terminal import scanner
        //ask the user for a positive value
        System.out.print("Enter a positive number: ");
        double userNumber = in.nextDouble();


        //check if the number is positive
        if (userNumber > 0) {

            //display square root of the number
            System.out.println(Math.sqrt(userNumber)); // for square root of a number import Math.sqrt(x)
            


            
        }
        else{
            System.out.println("error: the number must is not positive");
        }
        
        in.close();
        
    

     }
   } 

