import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // calculate the factorial of a non-negative number

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 1;

        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        System.out.println(sum);
    }
}
