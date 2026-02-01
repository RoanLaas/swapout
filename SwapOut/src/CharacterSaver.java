import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharacterSaver {
    public CharacterSaver(Character characterToSave){
        //ToDO: Gotta turn this into an actual component instead of a disjointed thing
    }
    private static BaseStats testBaseStats = new BaseStats(8, 7, 7, 9, 11, 1);
    private static Character testCharacter = new Character(testBaseStats, 10, "Henry");

    private static String testCharString = testCharacter.formatForSave();

    public static void main(String[] args){
        //ToDo: Change this output to not overwrite chars that already exist(Or maybe have a popup that asks)
        Path outputPath = Paths.get("SavedCharacters", testCharacter.getName());

        try{
                Files.createDirectories(outputPath.getParent());
                Files.writeString(outputPath, testCharString);

        } catch (IOException e){
            System.out.printf("Something's gone wrong: %s", e);
        }
    }
}
