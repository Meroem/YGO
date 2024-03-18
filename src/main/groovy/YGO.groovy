import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

class YGO {

    static void main(String[] args) {

        /**
         *tryconnecttodb(sqlite)
         *-DriverManager
         */
        String databaseUrl = "jdbc:sqlite:mydatabase.db"
        Connection connection = DriverManager.getConnection(databaseUrl)

        assert connection!= null
        println "Connection to my database exists, powered by Driver Manager \n"

        /**
         * todo : Create Table and Insert 1st roll
         *
         *      use Statement to do JDBCoperation
         *      using file to write sql
         */
        String script = new File('init.sql').text
        Statement statement = connection.createStatement();
        statement.executeUpdate(script)
        ResultSet resultSet = statement.executeQuery("SELECT * FROM monsterCard")

        while (resultSet.next()){
            println"${resultSet.getString('name')},${resultSet.getInt('rank')},"+
                    "${resultSet.getString('effect')}" +
                    "${resultSet.getInt('attackForce')},${resultSet.getInt('defendForce')}"
        }


        /**
         * transfer to use db
         */
//        System.out.println starting()
//        draw()
    }

    String readHandCards() {
        return null
    }

    static String starting() {
        String startSentence = """
      
        -------Game start------
        You first
        
        Turn 1:
        
        Ready stage
        
        Draw stage
        """;
        return (startSentence)
    }

    /**
     *  simplified deck&draw into draw,only draw 1 time(mock cards),then stop all.
     * @return
     */
    static void draw() {
        Card[] cards = new Card[]{
                //String name, int rank, String[] effect,
                // int attackForce,int defendForce,boolean isATKDisplay,boolean hasATKed
                new Monster("E Hero Neos", 8,
                        "Came from far universe,here to save you.", 2500, 3000),
                new Monster("E Hero Neos", 8,
                        "Came from far universe,here to save you.", 2500, 3000),
                new Monster("E Hero Neos", 8,
                        "Came from far universe,here to save you.", 2500, 3000),
                new Monster("E Hero Neos", 8,
                        "Came from far universe,here to save you.", 2500, 3000),
                new Monster("E Hero Neos", 8,
                        "Came from far universe,here to save you.", 2500, 3000),
        }
        for (Card card : cards) {
            System.out.println(card.readCardDetail())
        }
//    return Arrays.toString(cards)
    }

}






