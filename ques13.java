import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int b=sc.nextInt();
        int a[]=new int[b];
        System.out.println("Enter the elements in array");
        for(int f=0;f<a.length;f++){
            a[f]=sc.nextInt();
        }
        System.out.println("Enter the number of Steps");
        int n=sc.nextInt();
    
        for(int j=0; j<n; j++){
            int x=a[0];

        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=x;

    }

        for(int i:a){
            System.out.println(i);
        }
}}
