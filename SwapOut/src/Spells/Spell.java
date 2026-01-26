import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spell implements Serializable {
    public String name;
    public String description;
    public String damage;
    // public String effects;

    public Spell(String name, String description, String damage) {
        this.name = name;
        this.description = description;

        Pattern pattern = Pattern.compile("[0-9]*D(4|6|8|10|12|20)",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(damage);
        boolean matchFound = matcher.find();

        if (matchFound) {
            this.damage = damage;
        } else {
            System.out.println("Invalid Dice");
        }
    }    

}

// class Custom extends Spell {             Still thinking about this

// } 