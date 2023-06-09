package Text_blocks;

public class TheJavaTextBlock {
    public static void main(String[] args) {
        String iliadQuote = """
    "But raging still, amidst his navy sat
    The stern Achilles, stedfast in his hate;
    Nor mix’d in combat, nor in council join’d;
    But wasting cares lay heavy on his mind:
    In his black thoughts revenge and slaughter roll,
    And scenes of blood rise dreadful in his soul."
    """;
        System.out.println(iliadQuote);
        String query = """
    SELECT "EMP_ID", "LAST_NAME" FROM "EMPLOYEE_TB"
    WHERE "CITY" = 'INDIANAPOLIS'
    ORDER BY "EMP_ID", "LAST_NAME";
    """;
        System.out.println(query);
    }
}
