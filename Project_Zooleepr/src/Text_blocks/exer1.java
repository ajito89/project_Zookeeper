package Text_blocks;

public class exer1 {
    public static void main(String[] args) {
        String textBlock = """
    Hello\\sWord\\n!
    Hello Java\\s!""";

        System.out.println(textBlock.translateEscapes());

        String poem = """
              "Over hill, over dale,
              Thorough bush, thorough brier,
              Over park, over pale,
              Thorough flood, thorough fire!"
              """;

        System.out.println(poem);


        String confessionLove = """
    I
    love                   
    """;

        String favoriteLanguage = "Java";

        System.out.println(confessionLove + favoriteLanguage);


        String querySQL = """
                SELECT u.username, COUNT(*) as num_posts
                FROM users u
                JOIN posts p ON u.id = p.user_id
                WHERE p.published_at >= '2022-01-01'
                GROUP BY u.username
                HAVING COUNT(*) > 10
                ORDER BY num_posts DESC
                LIMIT 10;
                """;

        System.out.println(querySQL);

    }
}
