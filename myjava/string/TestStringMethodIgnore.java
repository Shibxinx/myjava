package string;

public class TestStringMethodIgnore {
    public static void main(String[] args) {
        {String a,b;
            a="SHIBA";
            b="shiba";
        if(a.equalsIgnoreCase(b))
        {System.out.print(a+ " equals " +b);}
        else System.out.print(a+ " not equlas " +b);    
        }
    }
    
}
