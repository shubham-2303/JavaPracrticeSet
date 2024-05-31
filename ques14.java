import java.util.Scanner;

public class ques14 {
    public static void End(int[] arr) {
        int count = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a=sc.nextInt();
        int arr1[]=new int[a];
        System.out.println("Enter the elements in array");
        for(int i=0; i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println();
        End(arr1);

        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
