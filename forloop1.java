import java.util.Scanner;
public class forloop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max;
		int i;
		
		System.out.print("Enter how many times want to loop:");
		max = sc.nextInt();
		
		for(i = 1 ; i <= max ; i++) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
