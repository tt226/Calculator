import java.util.Scanner;

class Casecheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // char at = give me the letter at this index
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }



    }
}
