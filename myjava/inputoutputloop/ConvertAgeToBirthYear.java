import java.util.Scanner;
public class ConvertAgeToBirthYear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int age;
        int Year = 2025 ; 

        System.out.print("How old are you?");
         age = Sc.nextInt();
         
        System.out.println(Year - age);
        Sc.close();
    } //end main
    
}//end class
