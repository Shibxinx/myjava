import java.util.Scanner;
public class ComputerAreaAndCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.1459;
        double r;
        
        System.out.print("InputRadius=");
        r = sc.nextDouble();
        double circle = pi*r*r;
        double area = r*r;

        System.out.println("Radius="+r);
        System.out.println("So area of radiant is = "+area);
        System.out.println("And Circle = "+circle);
        sc.close();

        
    }
}
