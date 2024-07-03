import java.lang.*;
import java.util.*;
class Main{
    static void perfectcube(int n){
        int cube;
        for(int i=0;i<=n;i++){
            cube=i*i*i;
            if(cube==n){
                System.out.println("YES");
                return;
                //break;
            }
            else if(cube>n){
                System.out.println("NO");
                return;
                //break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        perfectcube(n);
    }
}