import java.util.Scanner;

public class ComputeSqrtandPowerofIntValue {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.print("Please input integer n: ");
        int n = sc.nextInt();

        
        double sqrtN = Math.sqrt(n); 
        double powerN = Math.pow(n, 2); 

        
        System.out.println("So sqrt of n = " + sqrtN + ", is " + sqrtN + " And power of n = " + powerN + " is " + powerN);

    sc.close();
    }//end main

    
}//end class
