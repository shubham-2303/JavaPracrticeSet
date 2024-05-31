import java.util.Scanner;

public class ques8 {
    public static boolean palin(String str){
        str.toLowerCase();
        String myString = str;
      String space = myString.replaceAll("\\s", "");

        int n = str.length();
        int left = 0;
        int right = n - 1;
        
        while(left < right){
            if(str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println(palin(str));
    }
}
