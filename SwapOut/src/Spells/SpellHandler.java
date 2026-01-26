
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SpellHandler {

    Spell[] thinkOfNamePls;
    Spell[] custom;

    String filename = "file.ser";

    public SpellHandler() {

    }

    public static void saveSpell( String filename) {
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