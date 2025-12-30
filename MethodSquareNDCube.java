public class MethodSquareNDCube {

	public static void main(String[] args) {
		System.out.println(square(2));
		
		System.out.println(cube(3));
		
		String Fullname = getFullName("jeslin","raja");
		System.out.println(Fullname);
		
		int age = 21;
		
		if(AgeCheck(age)) {
			System.out.print("You must be 18+ to sign up");
		}
		else {
			System.out.print("you are welcome");
		}
		
	}
	static double square(double number) {
		return number * number;
		
	}
	static double cube(double number) {
		return number * number* number;
	}
	static String getFullName(String first, String last) {
		return first + " " + last;
	}
	static boolean AgeCheck(int age) {
		if (age < 18) {
			return true;
		}
		else {
			return false;
		}
	}

}
