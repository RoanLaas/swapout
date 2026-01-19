import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharacterSaver {
    
    private static BaseStats testBaseStats = new BaseStats(8, 7, 7, 9, 11, 1);
    private static Character testCharacter = new Character(testBaseStats, "George");

    private static String testCharString = testCharacter.toString();

    public static void main(String[] args){
       Path outputPath = Paths.get("SavedCharacters", "George");

        try{
                Files.createDirectories(outputPath.getParent());
                Files.writeString(outputPath, testCharString);

        } catch (IOException e){
            System.out.println("Something's gone wrong");
        }
    }
}
