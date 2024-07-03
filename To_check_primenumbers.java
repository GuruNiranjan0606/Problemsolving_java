//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isprime(n);

    }


    static void isprime(int n) {
        int c=0;
        if(n==1||n==0){
            c+=20;
        }
        else{
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    c++;
                }
            }
        }
        if(c>2){
            System.out.println("Not a prime");
        }
        else {
            System.out.println("Prime ");
        }

    }
}