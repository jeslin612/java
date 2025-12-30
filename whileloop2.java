import java.util.Scanner;

class whileloop2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String name ="";
        
        while (name.isEmpty()){
            System.out.print("Enter your name:");
            name = sc.nextLine();
            
        }
        
        System.out.print("hello " + name);
        
        sc.close();
        
    }
}
