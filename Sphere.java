import java.util.Scanner;
class Sphere{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        double radius;
        double circumference;
        double area;
        double volume;
        
        System.out.print("enter the radius:");
        radius = sc.nextDouble();
        
        circumference = 2 * Math.PI * radius;
        System.out.printf("value of circumference: %.2fcm\n", circumference);             //printf
        
        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("value of area: %.1fcm\n", area );
        
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("value of volume: %.1fcm\n", volume);
        
        sc.close();
    }
}
