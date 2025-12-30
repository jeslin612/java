import java.util.Scanner;
class Logical2{
    public static void main(String []args){
        String username ;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter your new username: ");
        username = sc.nextLine();
        
        if(username.length() < 4 || username.length() >12){
            System.out.print("Username must be contains 4 - 12 character");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.print("Username must not contains space or underscore");
        }
        else{
            System.out.print("hello " + username);
        }
        
        sc.close();
         
         
    }
}
