import java.util.Scanner;

public class TestElseNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade =0;
        System.out.print("In put grade :");
        grade = sc.nextInt();
        if(grade>=90) System.out.print("Grade = A");
        else if(grade>=80) System.out.print("Grade = B");
        else if(grade>=70) System.out.print("Grade = C");
        else if(grade>=60) System.out.print("Grade = D");
        else System.out.print("Fail !!");
        sc.close();
    }//end main
}//end class
