import java.util.Scanner;
class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String day;
 
        System.out.print("enter a day:");
        day = sc.nextLine();
 
        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("it is a weekday");
            case "saturday", "sunday" -> System.out.println("it is a weekend");
            default -> System.out.println(day + " is not a day");
        }
 
 
        sc.close();
 
    }
}
