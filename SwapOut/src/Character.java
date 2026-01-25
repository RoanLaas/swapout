public class Character extends DNDClass{
    private String name;
    private int xp;

    public Character(BaseStats stats, String name){
        super(stats);
        this.name = name;
        this.xp = 0;
    }

    public String getName(){
        return this.name;
    }

    public String formatForSave(){
        String savedChar = String.format("%s \n %d \n", this.name, this.xp);
        savedChar += this.baseStats.getAllStatsAsString();

        return savedChar;
    }
}
