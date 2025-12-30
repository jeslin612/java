import java.util.Scanner;

class NestedIF {
    public static void main(String[] args) {

        boolean student = false;
        boolean adult = false;
        double price = 9.99;

        if (student) {
            if (adult) {
                System.out.println("ur student get 10% discount");
                System.out.println("ur adult get 20% discount");

                price *= 0.7;
            } else {
                System.out.println("ur student get 10% discount");
                price *= 0.9;
            }
        } else {
            if (adult) {
                System.out.println("ur adult get 20% discount");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }
        System.out.printf("the price of the ticket: %.2f" , price );
    }
}
