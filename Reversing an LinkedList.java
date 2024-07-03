import java.util.*;
class HelloWorld {
    //    public static void main(String[] args) {
//        LinkedList<String>ll=new LinkedList<>();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of the LinkedList : ");
//        int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            ll.add(sc.nextLine());
//        }
//        while(n!=0){
//            System.out.println(ll.get(n));
//
//            n--;
//        }
//    }
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the LinkedList : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ll.add(sc.next());
        }
        Collections.reverse(ll);
        System.out.println(ll);
    }
}