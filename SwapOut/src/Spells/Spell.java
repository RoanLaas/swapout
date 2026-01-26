import java.io.*;

public class Spell implements Serializable {
    public String name;
    public String description;
    public String damage;
    // public String effects;

    public Spell(String name, String description, String damage) {
        this.name = name;
        this.description = description;
        this.damage = damage;
    }
}

// class Custom extends Spell {         Still thinking about this

// } 