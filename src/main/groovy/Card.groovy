abstract class Card {

    //card position
    protected final String IN_DECK = "in deck"
    protected final String ON_BATTLE_GROUND = "on battle ground"
    protected final String IN_HAND = "in hand"
    protected final String IN_GRAVE = "in grave"
    //card basic information
    protected String name
    protected int rank
    protected String effect
    protected boolean isFront
    protected String location

/**
 * constructor
 * @param name
 * @param rank
 * @param effect
 * @param isFront
 */
    Card(String name, int rank, String effect) {
        this.name = name
        this.rank = rank
        this.effect = effect
    }

/**
 * change card location :
 */
    void starting() {
        this.location = IN_DECK
    }

    void draw() {
        this.location = IN_HAND
    }

    void isUsing() {
        this.location = ON_BATTLE_GROUND
    }

    void isBroken() {
        this.location = IN_GRAVE
    }

    String readCardDetail() {
//        String detail = name + "\t" + rank + "\t" + effect.toString();
        String detail =  "$name \t $rank \t $effect"
        return detail
    }
}
