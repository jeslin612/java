import java.util.Scanner;

class doWhile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int age;
        
        do{
            System.out.println("Age must not be negative");
            System.out.print("enter age:");
            age = sc.nextInt();
        }while(age < 0);
        
        System.out.print("you are " + age + " year old");
        
        sc.close();
    }
}
