import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("sum of two number program");
        System.out.println("add num1");
        int num1 = in.nextInt();
        System.out.println("add num2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
