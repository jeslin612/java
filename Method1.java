import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.print("enter your name:");
		name = sc.nextLine();
		
		System.out.print("enter your age:");
		age = sc.nextInt();
		
		System.out.println(" ");
		
		HappyBirthday(name , age);
		HappyBirthday(name , age);
		
		
		sc.close();

	}
	
	static void HappyBirthday(String name , int age) {
		
		System.out.println("Happy Birthday to you");
		System.out.printf("happy birthday to %s\n", name);
		System.out.printf("you are %d yrs old \n", age);
		System.out.println(" ");
		
	}

}
