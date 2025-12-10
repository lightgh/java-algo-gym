package topicwise.string;

public class StringPractice2 {
    public static void main(String[] args) {
        String string = """ 
                This is a string practice
                """;
        System.out.printf("This String is %s", string);

        String textBlock = """
                java One, Kotlin Two \s
                This is another line of string\n
                This is another line of string again\sJane\skate
                come here to the end of the string        \s
                line checking\n
                another line check\ning
                outcome
                """;

        System.out.println("textBlock = " + textBlock);

        String textBlockA = """
                <session>
                    <speaker>
                        Jeanne Boyarsky \
                    </speaker> \
                </session>""";

        System.out.println("textBlockA = \n" + textBlockA);

        String textBlockC = """
                better \"""
                but can do \"\"\"
                """;

        System.out.println("\ntextBlockC = \n" + textBlockC);

        var nameStr = """
                Sample String Statement
                """;
        System.out.printf("nameStr Indexing %s \n", nameStr.indexOf("St", 0, 12));

        String query = """
                SELECT name FROM table_name \
                WHERE id = 'snow';
             """;
        var num = 34;
        var num2 = 23;
        System.out.println(STR."query = \{query} | \{num} + \{num2} = \{num + num2}");

        String sql2 = "Select * from mytable";

        String sql3 = """
                select * \n
                from mytable; \
                """;
        System.out.print(sql3);

        String sql4 = """
                select "name"
                from mytable \
                where value = '\"""'
              """;
        System.out.println("\nsql4 = \n" + sql4);
    }
}
