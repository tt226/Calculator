import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

      /* for loop
      Syntax :
      for (initialisation; condition; increment/decrement)
      initialisation happens once, and then it goes between condition and increment
       */
        for (int i = 0; i <= 5; i++){
            System.out.println(i);
        }

        // let's write a while loop

        /*
        The syntax: while(condition){
        // body
        }
         */

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num += 1;
        }
        int t = 10;
        do {
            System.out.println(t);
            t += 1;

        }while (t <= 15);
    }
}
