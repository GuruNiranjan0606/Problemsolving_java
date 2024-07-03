//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,6,5};
        int len= arr.length;
        for(int i=0;i<len;i++){
            for(int j=1;j<len;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }



    }
}