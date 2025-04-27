//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char itterator = scan.next().charAt(0);
        int sum1 = scan.nextInt();
        int sum2 = scan.nextInt();
        if (itterator == '+')
            System.out.println(sum1 + sum2);
        if (itterator == '*')
            System.out.println(sum1 * sum2);
        if (itterator == '/')
            System.out.println(sum1 / sum2);
        if (itterator == '-')
            System.out.println(sum1 - sum2);
        else {
            System.out.println("poshel naxui");
        }
    }
}