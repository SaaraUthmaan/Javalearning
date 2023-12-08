import java.util.Random;
import java.util.Scanner;

public class RandomTry {
    public static void main(String[] args) {
        Scanner userReply = new Scanner(System.in);
        System.out.println("Pick a number between 1 - 10");
        int userNumber = userReply.nextInt();

        //can use if statemnet here too
        while(userNumber > 10){
            System.out.println("Please Pick a number between 1 - 10");
             userNumber = userReply.nextInt(); 
        }
        Random luck = new Random();
            int number = luck.nextInt(10) + 1;
            System.out.println(number + " ");
           
           int difference = userNumber - number; 
            
        if(number == userNumber){
            System.out.println("You are an AMAZING Guesser!");
        }else{
            System.out.println("You were off by "+ Math.abs(difference) +" points. Try harder next time.");
        }    
    }
    
}
