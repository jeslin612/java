import java.util.Scanner;

class Hypotenuse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        
        System.out.print("enter value for a:");
        a = sc.nextDouble();
        a = Math.pow(a, 2);
        
        System.out.print("enter value for b:");
        b = sc.nextDouble();
        b = Math.pow(b, 2);
        
        // c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        c = Math.sqrt(a + b);
        
        System.out.print(c);
        
        sc.close();
    }
}
