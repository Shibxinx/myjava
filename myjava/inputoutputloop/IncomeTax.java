import java.io.*;

public class IncomeTax {

    public static void main(String[] args) throws IOException 
    {
        
        double income;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("please input your income (Bath) : ");
        income = Double.parseDouble(input.readLine());

        System.out.print("your income = "+income+"and tax ="+(0.05*income));

        input.close();
    }//end main
}//end class