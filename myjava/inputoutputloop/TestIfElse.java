import java.util.Scanner;

public class TestIfElse {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        int grade =0;
        System.out.print("Plase input Grade : ");
        grade = sc.nextInt();
        if(grade>=60){
            System.out.print("Pass!! Congratulation");
            sc.close();
        }//end if






    }//end method main

}//end class