import java.util.Scanner;

public class concurrence {
    public static void main(String[] args) {
        // Q. find the number of times n appears in this number

        int count = 0;
        int n = 453453;
        while (n > 0){
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
