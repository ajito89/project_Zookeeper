package Text_blocks;

public class The_bad_and_the_ugly {
    public static void main(String[] args) {

        String iliadQuote = "\"But raging still, amidst his navy sat\n" +
                "The stern Achilles, stedfast in his hate;\n" +
                "Nor mix’d in combat, nor in council join’d;\n" +
                "But wasting cares lay heavy on his mind:\n" +
                "In his black thoughts revenge and slaughter roll,\n" +
                "And scenes of blood rise dreadful in his soul.\"";

        String query = "SELECT \"EMP_ID\", \"LAST_NAME\" FROM \"EMPLOYEE_TB\"\n" +
                "WHERE \"CITY\" = 'INDIANAPOLIS'\n" +
                "ORDER BY \"EMP_ID\", \"LAST_NAME\";\n";

        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";

        System.out.println(iliadQuote);
        System.out.println(query);
        System.out.println(html);
    }
}
