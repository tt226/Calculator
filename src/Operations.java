public class Operations {
    public static void main(String[] args) {

        /*
        if(boolean expression T or F) {
            // body
        } else {
            // do this
        }
         */
     int salary = 25400;
     if(salary >= 10000){
         salary = salary + 1000;
     } else {
         salary = salary + 2000;
     }

     if (salary > 1000){
         salary += 1000;
     } else if (salary < 1000) {
         salary += 1201;

     } else {
         salary = salary;
     }
        System.out.println(salary);

    }


}
