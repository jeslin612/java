import java.util.Scanner;
class Switch1 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String day;
 
        System.out.print("enter a day:");
        day = sc.nextLine();
 
        switch(day){
            case "monday" -> System.out.println("it is a weekday");
            case "tuesday" -> System.out.println("it is a weekday");
            case "wednesday" -> System.out.println("it is a weekday");
            case "thursday" -> System.out.println("it is a weekday");
            case "friday" -> System.out.println("it is a weekday");
            case "saturday" -> System.out.println("it is a weekend");
            case "sunday" -> System.out.println("it is a weekend");
            default -> System.out.println(day + " is not a day");
        }
 
 
        sc.close();
 
    }
}
