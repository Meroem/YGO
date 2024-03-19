import dao.CrudService

class YGO {

    static void main(String[] args) {

        CrudService crudService = new CrudService("jdbc:sqlite:mydatabase.db")
        //check if create & connected successfully
        assert crudService.connection != null
        println "Connection to my database exists, powered by Driver Manager \n"

        //crud example
//        crudService.createRecored("Increasing C",10,"Only when special summoned over 5times,summon it on your field",0,0)
//        crudService.updateRecoredName("Increasing Cockroach","Increase C")
//        crudService.deleteRecord("Increasing C")
        println crudService.readRecord()

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






