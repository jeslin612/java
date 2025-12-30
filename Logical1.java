import java.util.Scanner;
class Logical1{
    public static void main(String []args){
        int temp ;
        boolean sunny = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter temperature: ");
        temp = sc.nextInt();
        
        if(temp <= 30 && temp > 0 && sunny){
            System.out.print("Nice Sunny Weather");
        }
        
        else if(temp <= 30 && temp > 0 && !sunny){
            System.out.print("Cloudy Weather");
        }
        
        else if(temp > 30 || temp < 0){
            System.out.print("Bad Weather");
        }
        
        sc.close();
         
         
    }
}
