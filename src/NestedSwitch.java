import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers to sum: ");
        int n = in.nextInt();

        // initialize variable
        int sum = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Enter number " + (i + 1) + ": ");
            int number = in.nextInt();
            sum += number;
        }
        System.out.println("The sum of the number is " + sum);

    }
}
