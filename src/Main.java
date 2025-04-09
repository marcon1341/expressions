//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //primitive
        char c = 'A'; // create variable of type and assign value A
        int quantity = 12; // an even dozen
        double price = 1.23; // double precision floating point decimal

        // non primitive (complex/ object /collection)
        String name = "Marcon";
        String last = "sol";
        Integer age = 25; // wrapped primitive is called a booked primitive
        Double weight = 140.22;

        //expression are like equation that calculate a result to use
        double total = quantity * price; //cal total multiple qty time price
        String full = name +"-->"+ last; // concatenation
        System.out.println(total);
        System.out.println(full);

        //float third = 1.0f / 3.0f; //demo floating point error (rounding)
        double third = 1.0 / 3.0;
        System.out.println(third);

        //float pi = 3.1415926535f;// float data type is too small so use double
        double pi = 3.1415926535;
        System.out.println(pi);

        double cost_in_pennies = 100;
        double total_cost = cost_in_pennies / 3;
        System.out.println(total_cost);


    }
}