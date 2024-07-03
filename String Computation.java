import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char prevCh = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char currCh = str.charAt(i);
            if (prevCh == currCh) {
                count++;
            } else {
                System.out.print(prevCh);
                System.out.print(count);
                count = 1;
                prevCh = currCh;
            }
        }
        System.out.print(prevCh);
        System.out.print(count);
    }
}