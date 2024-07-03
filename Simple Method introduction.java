//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int r=hello(10,20);
        System.out.println(r);

    }
    public static int hello(int a,int b){
        //System.out.println((a+b));   --> for return type void
        return a+b;
    }
}