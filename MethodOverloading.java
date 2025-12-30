public class MethodOverloading {

	public static void main(String[] args) {
		
		String pizza = bakepizza("flat bread","mozzarella","pepperoni");
		
		System.out.println(pizza);

	}
	static String bakepizza(String bread) {
		return bread + " pizza";
	}
	static String bakepizza(String bread, String cheese) {
		return cheese + " cheese " + bread + " pizza";
	}
	static String bakepizza(String bread, String cheese, String topping) {
		return topping +" " + cheese + " cheese " + bread + " pizza";
	}

}
