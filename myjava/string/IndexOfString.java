package string;

public class IndexOfString {
    public static void main(String[] args) {
        {
            String studentWord1="Welcome to java,Hello everybody,My name is Somsri,Hello!!!";
            int post1 = studentWord1.indexOf("Hello");
            int post2 = studentWord1.indexOf("Hello",25);
            int post3 = studentWord1.lastIndexOf("Hello");
            int post4 = studentWord1.lastIndexOf("Hello",25);
        System.out.print("post1 ="+ post1);
        System.out.print("\npost2 ="+ post2);
        System.out.print("\npost3 ="+ post3);
        System.out.print("\npost4 ="+ post4);

        }
    }
    
}
