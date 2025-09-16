import java.util.Scanner;

public class HWeek4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int member ;
        double price =0.0 , total =0.0 ;

    //..............................................
    System.out.print("Input member : ");
    member = sc.nextInt();
    System.out.print("Input price per member : ");
    price = sc.nextDouble();

  
    if (member >8)
    total = (price * 8 )+(price-(price*0.05))*(member -8);
    else  if(member <=8 )
             total = price*8 ;
        
    //..............................................
    System.out.print("Your Group Member = "+member);
    System.out.print("\nYour total payment charge = "+total);
    sc.close();
    }
    
}
