import java.util.Scanner;
public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("What is the celsius degree: ");
            int celsius = sc.nextInt();
            int fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("So temperature in Fahrenheit is: " + fahrenheit + "F");
            sc.close();
        
    }//end main
    
}//end class
