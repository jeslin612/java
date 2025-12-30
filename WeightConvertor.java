import java.util.Scanner;
class WeightConvertor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int choice;
        double weight;
        double newweight;
        
        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        
        if(choice == 1){
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("weight in kgs: %.2f", newweight);
        }
        else if (choice == 2){
            System.out.print("Enter weight in kgs: ");
            weight = sc.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("weight in lbs: %.2f", newweight);
        }
        else{
            System.out.println("invalid number");
        }
        
        sc.close();
    }
}
