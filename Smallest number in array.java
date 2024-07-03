import java.lang.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Size of an array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println("The Smaller number is: "+max);
    }
}