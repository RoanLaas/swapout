
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpellHandler {

    Spell[] thinkOfNamePls;
    Spell[] custom;

    String filename = "file.ser";

    // Gotta figure out how to tie the list, createSpell and saveSpell together and it's gg ez

    // Iniator
    public SpellHandler() {}

    public static Spell createSpell() {
        Spell spell = null;

        // Make this shit interact with the UI to streamline the process

        // Get name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter spell name: ");
        String name = sc.nextLine();
        spell.name = name;

        // Get description
        System.out.println("Enter spell description: ");
        String description = sc.nextLine();
        spell.description = description;

        // Get damage
        boolean matchFound = false;
        while (!matchFound) {

            System.out.println("Enter spell damage: ");
            String damage = sc.nextLine();

            // Verify damage makes sense yes.
            Pattern pattern = Pattern.compile("[0-9]*D(4|6|8|10|12|20)",Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(damage);
            matchFound = matcher.find();

            if (matchFound) {
                spell.damage = damage;
            } else {
                System.out.println("Invalid Dice");
            } 
        }

        return spell;
    }

    public static Spell selectSpell() {
        Spell obj = null;
        // this will have to interact with the spell list and the ui
        return obj;
    }

    public static void saveSpell(String filename) {
        // Figure out how to save the spells
        Spell object = new Spell("Fireball", "Shoots a fireball", "6D8");

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("Ioexception is caught");
        }
    }

    public static Spell loadSpell(String filename) {
        // Figure out how to load the spells
        Spell object = null;
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object = (Spell) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserealized");
            System.out.println("Name of spell: " + object.name);

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

        return object;
    }

    public static void main(String[] args) {
        saveSpell("file.ser");
        loadSpell("file.ser");
    }
}