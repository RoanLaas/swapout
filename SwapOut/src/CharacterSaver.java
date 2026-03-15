import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharacterSaver  implements Serializable{
    public CharacterSaver(Character characterToSave){
        //ToDO: Gotta turn this into an actual component instead of a disjointed thing
    }

    public static void main(String[] args){
        //ToDo: Change this output to not overwrite chars that already exist(Or maybe have a popup that asks)
        
        BaseStats testBaseStats = new BaseStats(8, 7, 7, 9, 11, 1);
        Character testCharacter = new Character(testBaseStats, 10, "Henry");

        String outputPath = "/SavedCharacters";

        try{
                FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

                objectOutputStream.writeObject(testCharacter);

                objectOutputStream.close();

        } catch (IOException e){
            System.out.printf("Something's gone wrong: %s", e);
        }
    }
}
