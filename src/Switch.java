import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        /*
        display the description of the fruit said by user
         */

//        switch (fruit) {
//            case "mango" -> System.out.println("Best Fruit ever");
//            case "banana" -> System.out.println("Loudest fruit ever");
//            case "pineapple" -> System.out.println("big cute fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }
        switch (day) {
            case 1:
                System.out.println("Peer");
                break;
            case 2:
                System.out.println("Mungal");
                break;
            case 3:
                System.out.println("Budd");
                break;
            case 4:
                System.out.println("Juma-e-raat");
                break;
            case 5:
                System.out.println("Jumma");
                break;
            case 6:
                System.out.println("Hafta");
                break;
            case 7:
                System.out.println("Itwar");
                break;
        }

    }
}
