import java.util.Scanner;

class whileloop3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int age;
        
        System.out.print("enter age:");
        age = sc.nextInt();
        
        while(age < 0){
            System.out.println("Age must not be negative");
            System.out.print("enter age:");
            age = sc.nextInt();
        }
        
        System.out.print("you are " + age + " year old");
        
        sc.close();
    }
}
