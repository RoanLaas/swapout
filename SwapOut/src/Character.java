import java.io.Serializable;

public class Character extends DNDClass implements Serializable{
    private String name;
    private int xp;
    private int health;
    private static final long serialVersionUID = 1L;

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
}
