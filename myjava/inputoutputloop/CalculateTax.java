import java.util.Scanner;

public class CalculateTax 
{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    double income =0;
    double tax =0;

    System.out.print("In put income :");
    income = sc.nextDouble();
    if (income > 10000000)
        tax = income * 0.3;
    else if(income>5000000 && income <=10000000)
        tax = income * 0.2;
    else if(income>1000000 && income <=5000000)
        tax = income * 0.1;
    else if(income>500000 && income <=1000000)
        tax = income * 0.05;
    else {System.out.print("No Charge");
}
System.out.print("\nYou Tax Charge"+tax);
sc.close();
    
}
}