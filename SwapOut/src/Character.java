public class Character extends DNDClass{
    private String name;
    private int xp;
    private int health;

    public Character(BaseStats stats,int health, String name){
        super(stats);
        this.name = name;
        this.health = health;
        this.xp = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getXP(){
        return this.xp;
    }

    public int getHealth(){
        return this.health;
    }

    //ToDo: reformat this so that it matches the order in which the base-stats are input, just so it's easier to check if something's wrong
    public String formatForSave(){
        String savedChar = String.format("%s\n%d\n%d\n", this.name, this.xp, this.health);
        savedChar += this.baseStats.getAllStatsAsString();

        return savedChar;
    }
}
