import java.util.Scanner;
 
public class whileloop1 {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		String temp = " ";
		
		while(!temp.equals("q")) {
			System.out.println("you are playing a game");
			System.out.print("to end a game press q:");
			temp = sc.next().toLowerCase();
		}
		
		System.out.print("you are quit a game");
		
		sc.close();
		
		
	}
	
}
