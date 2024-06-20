import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me 3 numbers");

        // lets take 3 input numbers
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q. find the largest of the inputs

        int max = a;
        if (b > max) {
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);

        // math.max(32, 43) gives the max of the two numbers
    }
}
