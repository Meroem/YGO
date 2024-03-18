class Monster extends Card {
/**
 * additional parameters of Monster-Cards:
 */
    protected int attackForce
    protected int defendForce
    protected boolean isATKDisplay
    protected boolean hasATKed


    /**
     * None element added constructor
     * 真的应该存在吗？怪兽卡自然是要被完全实现才对，不给全的构造方法是否不该存在？
     */
    Monster(String name, int rank, String effect) {
        super(name, rank, effect)
    }

    /**
     * read card detail to user
     * @return
     */
    @Override
    String readCardDetail() {
//        String detail1 = name + "\t" + rank + "\n" + Arrays.toString(effect) + "\n" + attackForce + "\t" + defendForce + "\n"
        String detail = "$name \t $rank \t $effect  \n $attackForce $defendForce \n"
        return detail
    }

    /**
     * With element constructor
     */
    Monster(String name, int rank, String effect, int attackForce, int defendForce) {
        super(name, rank, effect)
        this.attackForce = attackForce
        this.defendForce = defendForce
    }


}
