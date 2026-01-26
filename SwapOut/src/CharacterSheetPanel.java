import javax.swing.JPanel;
import javax.swing.JLabel;

public class CharacterSheetPanel extends JPanel{
    private BaseStats testBaseStats = new BaseStats(8, 7, 7, 9, 11, 1);
    private Character testPlayer = new Character(testBaseStats, "Borb2");

    private int test = testPlayer.baseStats.getCharisma();

    public CharacterSheetPanel() {
        add(new JLabel(String.format("%d", test)));
    }
}
