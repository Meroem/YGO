import java.sql.Connection
import java.sql.DriverManager

class YGO {

    static void main(String[] args) {
        System.out.println starting()
        draw()
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






