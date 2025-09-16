import java.util.Scanner;

public class Testifelse2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int grade = 0;
        System.out.println("Plase input Grade :");
        grade = sc.nextInt();
        if (grade>=60){
        System.out.println("Pass Congratulation");
        }else {
            System.out.println("Fail");
        }
        sc.close();
}
}
