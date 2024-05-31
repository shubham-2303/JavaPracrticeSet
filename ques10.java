import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements in the array");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target element");
        int t=sc.nextInt();
        System.out.println("Target element is " + t);
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]==t){
                System.out.println(i);
            }
        }
    }
}
