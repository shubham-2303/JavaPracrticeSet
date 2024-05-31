import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a String");
        String str=sc.next();
        int[] count = new int[256];
          char ch[]=str.toCharArray();
        for (char c : str.toCharArray()) {
            count[c]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.print((char) i+ "" + count[i] + " ");
            }
        }
    }
}
