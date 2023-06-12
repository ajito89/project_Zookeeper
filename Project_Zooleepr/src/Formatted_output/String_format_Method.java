package Formatted_output;

public class String_format_Method {
    public static void main(String[] args) {
        int agge = 22;
        String str = String.format("My age is %d", agge);
        System.out.println(str);

        int age = 22;
        char initial = 'M';
        String surname = "Anderson";
        double height = 1.72;

        //You can see that we have used four data types in this example.
        // Java will replace %c, %s, %d, %f with initial, surname, age, and height respectively.
        // %n is the newline character that breaks the line every time it is used.
        String details = String.format(
                "My name is %c. %s.%nMy age is %d.%nMy height is %.2f.",
                initial, surname, age, height);
        System.out.println(details);



        //The String class also has a newer and slightly simpler method
        // formatted(Object... args) that you can use instead of the static String.
        // format method. Both of them have the same method body,
        // so they are completely interchangeable. Here's how it looks in the program
        //JAVA 15
        //String detailss = "My name is %c. %s.%nMy age is %d.%nMy height is %.2f."
         //       .formatted(initial, surname, age, height);

        //System.out.println(detailss);
    }
}
