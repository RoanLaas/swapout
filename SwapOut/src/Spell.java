import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spell {
    protected String name;
    protected String description;
    protected String damage;
    // private String effects;
}

class Custom extends Spell {

    // Custom is used for user-generated spells, I still have to fuck around with this to see if it's working
    public void createCustom(String name, String description, String damage) {
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