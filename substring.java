// .substring() = A method used to extract a portion of a string
// .substring(start, end)
// used in email

import java.util.Scanner;
class substring {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String email;
        String username;
        String domain;
        
        System.out.print("Enter your email:");
        email = sc.nextLine();
        
        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            
            System.out.println("your username:" + username);
            System.out.println("your domain:" + domain);
            
        }
        else{
            System.out.println("your email must be contain @");
        }
        
        
        sc.close();
    }
}
