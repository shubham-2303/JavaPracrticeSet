import java.util.Scanner;

public class ques6 {
    public static boolean anag(String str) {
        str = str.toLowerCase();

        boolean[] present = new boolean[26];

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        for (boolean isPresent : present) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);


         System.out.println("enter The String");

           String b=sc.next();
        System.out.println(anag(b));
        
        }
}
