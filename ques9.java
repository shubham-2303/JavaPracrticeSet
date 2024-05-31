import java.util.Scanner;

public class ques9 {
    public static void arr(int arr[]) {
        int max=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0; 

                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k]; 

            }
            System.out.println( sum);

            System.out.println();
            if(sum>max){
                max=sum;
            }

        }


    }
    System.out.println("Maximum Sum is " + max);

}
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter The size of array");
                int a=sc.nextInt();
                int arr1[]=new int[a];
                System.out.println("Enetr the elements in an array");
                for(int i=0; i<=arr1.length-1;i++){
                    arr1[i]=sc.nextInt();
                }

                

                arr(arr1);
            }
}
