import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Random ra = new Random();
		
		int guess ;
		int attempt = 0;
		int max = 100;
		int min = 1;
		
		int random = ra.nextInt(min , max +1 );
		
		System.out.println(" Random Number Guessing Game");
		System.out.println("Guess a number between 1 - 100");
		
		do {
			System.out.print("Enter a number:");
			guess = sc.nextInt();
			attempt++;
			
			if(guess < random) {
				System.out.println("your number is too low");
			}
			else if(random < guess) {
				System.out.println("your number is too high");
			}
			else {
				System.out.println("you got it");
			}
			
		}while(guess != random);
		
		System.out.println("You have try " +attempt +" attempt");
		
		sc.close();

	}

}
