import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double num1;
        double num2;
        double total = 0;
        char operator;
        boolean valid = true;
        
        System.out.print("enter a num1:");
        num1 = sc.nextDouble();
        
        System.out.print("enter a operator(+, -, *, /, ^):");
        operator = sc.next().charAt(0);
        
        System.out.print("enter a num2:");
        num2 = sc.nextDouble();
        
        switch(operator){
            case '+' -> total = num1 + num2;
            case '-' -> total = num1 - num2;
            case '*' -> total = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("Cannot Div by Zero");
                    valid = false;
                }
                else{
                    total = num1 / num2;
                }
            }
            case '^' -> total = Math.pow(num1, num2);
            default -> {
                System.out.print("invaild"); 
                valid = false;
            }
        }
       if(valid){
           System.out.println("total:" + total);
       }
        
        sc.close();
        
    }
}
