import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String age = "";
        String food = "";
        System.out.print("What's your name?");
        name = sc.nextLine();
        System.out.print("Nice to meet you!" + name);
        System.out.print("\nHow old are you?");
        age = sc.nextLine();
        System.out.print("Oh you're only" + age);
        System.out.print("\nWhat's is you favorite food?");
        food = sc.nextLine();
        System.out.print("Ohh!"+ food);
        System.out.print("\nI like it too");
        sc.close();
    }//end main
    
}//end class
