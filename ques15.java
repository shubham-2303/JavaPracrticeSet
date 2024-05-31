import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String");
        String str=sc.next();

        boolean result = Equal(str);
        System.out.println(result);
    }

    public static boolean Equal(String str) {
        
        if (str.length() < 4) { 
            return false;
        }

    
        String first= str.substring(0, 2);
        String last = str.substring(str.length() - 2);


        return first.equals(last);
    }
}
