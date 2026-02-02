import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterSheetPanel extends JPanel{

    public CharacterSheetPanel() {
        //ToDo figure out how to align these properly to make it look nicer
        JButton createCharButton = new JButton("Create a character");
        add(createCharButton);

        JButton importCharButton = new JButton("Import a character");
        add(importCharButton);

        createCharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                remove(createCharButton);
                remove(importCharButton);
            }
        });
    }
}
