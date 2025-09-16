import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int code = 0;
        
        System.out.print("input code : ");
        code = sc.nextInt();

        switch(code) {
            case 1 : System.out.println("This is test case 1 :)"); break;
            case 2 : System.out.println("This is test case 2 ><"); break;
            default : System.out.println("not in any case GoodBye :3");
            sc.close();
        }//end switch
        System.out.print("This is out swiuch");
    }//end main
    
}//end class
