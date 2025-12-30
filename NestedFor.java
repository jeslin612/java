import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int coloum;
		int row;
		char symbol;
		
		System.out.print("enter no of coloum:");
		coloum = sc.nextInt();
		
		System.out.print("enter no of row:");
		row = sc.nextInt();
		
		System.out.print("enter a symbol:");
		symbol = sc.next().charAt(0);
		
		for(int i = 1 ; i <= row ; i++ ) {
			for (int j = 1; j <= coloum; j++) {
				System.out.print(symbol +" ");
			}
			System.out.println("");
		}
		
		
		sc.close();

	}

}
