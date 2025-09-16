import java.util.Scanner;

public class CalculateEletic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eUsed = 0.0, eCharge = 0.0 ;
        System.out.print("Input Electric used :");
        eUsed = sc.nextDouble();
        //...........................................................
        if (eUsed>300)
            eCharge += (eUsed-300)* 9.00;
            eUsed = 300;
        if ((eUsed>200) && (eUsed<=300))
            eCharge += (eUsed-200) *7.00;
            eUsed = 200 ;
        if (eUsed<=200)
            eCharge +=eUsed*5.00;
        //...........................................................
         
        System.out.print("Electric used :"+eUsed+"\nYou ElecCharge ="+eCharge);
        sc.close();
    }// end main
}//end class
