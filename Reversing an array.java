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
        int rarr[]=new int[n];
        int a=n-1;
        for(int i=0;i<n;i++){
           // rarr[i]=arr[arr.length-1-i];
            rarr[i]=arr[a];
            a--;
        }
        for(int num:rarr){
            System.out.print(num+" ");
        }
             sc.close();
        //System.out.println(Arrays.toString(rarr));

    }
}