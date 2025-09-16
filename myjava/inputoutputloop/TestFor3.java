import java.util.Scanner;

public class TestFor3 {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    System.out.println("Input num");
    num = sc.nextInt();
    for(int i= 1 ; i <=12 ; i++){
        System.out.println(num +"x"+ i +"="+(num*i));
    sc.close();
    }
    }//end main
    
}//end class
