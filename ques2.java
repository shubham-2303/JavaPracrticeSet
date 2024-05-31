
import java.util.Scanner;

public class ques2 {

    public static int fact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void strong(int[] arr){
        for (int a : arr) {
            int num = a;
            int sum = 0;
            int temp = a;
            while(temp > 0){
                int digit = temp % 10;
                sum += fact(digit);
                temp /= 10;
            }
            if(num == sum){
                System.out.println(num + " is a Strong Number");
            }
            else{
                System.out.println(num + " is not a Strong number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of Array");
        int a =sc.nextInt();
        int arr[]= new int[a];
        System.out.println("Enter the elements in the array");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
        strong(arr);
    }
}
