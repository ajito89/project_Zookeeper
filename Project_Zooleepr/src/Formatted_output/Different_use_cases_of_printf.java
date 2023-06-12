package Formatted_output;

public class Different_use_cases_of_printf {
    public static void main(String[] args) {
        //You can display an integer with the %d format specifier.
        System.out.printf("Display a Number %d", 15000);
        //If you want several integers to be displayed in the output, use several %d specifiers.
        System.out.printf(" The sum of %d and %d is %d", 15, 40, 55);
        //If you want to display a floating-point value, use the %f specifier.
        System.out.printf(" Display a Number %f", 15.23);
        //You don't want so many trailing zeros. You can set the number's precision with the printf() method.
        System.out.printf(" Display a Number %.2f", 15.23);

        //Similarly, you can display Characters and Strings with the printf() method.
        // Take a look at the following code. If you want to print a character, use %c,
        // and if you want to print a String, use %s.
        char abbr = 'H';
        String element = "Hydrogen";
        System.out.printf(" %c stands for %s", abbr, element);


    }
}
