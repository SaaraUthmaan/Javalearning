import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner userReply = new Scanner(System.in);
        System.out.println("How many numbers will you be using in this caluclation?");
        int numOfNumbers = userReply.nextInt();
        int[] numCalc = new int[numOfNumbers];
        while (numOfNumbers <= 1) {
            System.out.println("Please enter a number greater than 1.");
            numOfNumbers = userReply.nextInt();
        }
        for(int i = 0; i < numOfNumbers; i++){
            System.out.println("What is you " + (i + 1) + " number");
            numCalc[i] = userReply.nextInt();
        }
        
        String sign = ""; 
        
         System.out.println("Please input the sign to use for calculations");
         sign = userReply.next();         

        if (sign.equals("+")) {
            int result = numCalc[0]; // Initialize with the first number

            // Add the remaining numbers
            for (int i = 1; i < numOfNumbers; i++) {
                result += numCalc[i];
            }

            System.out.println("Result of Addition: " + result);
            
        } else if(sign.equals("-")) {
        int result = numCalc[0]; 

            // Substract the remaining numbers
            for (int i = 1; i < numOfNumbers; i++) {
                result -= numCalc[i];
            }
            System.out.println("Result of Substraction: " + result);
        } else if(sign.equals("*")){
        int result = numCalc[0]; 

            // Multiply the remaining numbers
            for (int i = 1; i < numOfNumbers; i++) {
                result *= numCalc[i];
            }
        System.out.println("Result of Multipication: " + result);
        } else if(sign.equals("/")){
        int result = numCalc[0]; 

            // Divide the remaining numbers
            for (int i = 1; i < numOfNumbers; i++) {
                result /= numCalc[i];
            } 
        System.out.println("Result of Division: " + result);       
        }
     
   }  
}   


        
    
