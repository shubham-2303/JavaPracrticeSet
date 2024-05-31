 import java.util.Scanner;
class ques1 {

    public static int count(int n) {
        int c = 0;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            c++;
        }
        return c;
    }

    public static int pow(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res = res * a;
        }
        return res;
    }

    public static void armstrong(int a) {
        int num = a;
        int n = count(a);
        int sum = 0;
        while (a > 0) {
            int temp = a % 10;
            int p = pow(temp, n);
            sum = sum + p;
            a /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int w=sc.nextInt();

        armstrong(w);
    }
}
