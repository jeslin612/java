import java.util.Scanner;
public class countdown {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		int count;
		int i;
		
		System.out.print("Enter how many sec want to count:");
		count = sc.nextInt();
		
		for(i = count ; i > 0 ; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("Happy New Year");
		
		sc.close();

	}

}
