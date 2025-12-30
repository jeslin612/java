import java.util.Scanner;
class Ternary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double income;
        double tax;
        double aftertax;
        double newsalary;
        
        System.out.print("Enter your Salary:");
        income = sc.nextDouble();
        
        tax = (income <= 40000) ? 0.15 : 0.30 ;
        
        aftertax = income * tax;
        System.out.println("your tax amount:" + aftertax );
        
        newsalary = income - aftertax;
        System.out.println("your Salary after tax:" + newsalary);
        
        
        sc.close();
        
    }
}
