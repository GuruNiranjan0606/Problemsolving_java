import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Elements of arrray:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Target value");
        int tar=sc.nextInt();
        int count=0;
        for(int num:arr){
            if(num==tar){
                count++;
            }
        }
        System.out.println("The occurance of"+tar+" in array is "+count);
    }
}