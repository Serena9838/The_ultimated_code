import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int min = 0;
        int max = 100;

        Random y = new Random();
        int secret = y.nextInt(max-min) + min; //介於0-99
        System.out.println("The secret number is : " + secret);

        while(true){
            System.out.print("Make a guess (between "+min +" and " + max+"):");
            int guess =x.nextInt();

            if (guess < min || guess > max){
                System.out.println("Please make a valid guess.");
                continue;
            }
            if(guess == secret){
                System.out.println("You win! The secret is : " + secret);
                break;
            }else if (guess < secret ){
                min = guess;
            }else if (guess > secret) {
                max = guess;
            }


        }
    }
}