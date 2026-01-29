import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SpellBuilderPanel extends JPanel{
    public SpellBuilderPanel(){
        ImageIcon image = new ImageIcon("Spell.png");
        JLabel label = new JLabel();
        label.setIcon(image);
        add(label);
    }
}
