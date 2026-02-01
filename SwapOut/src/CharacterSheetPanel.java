import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterSheetPanel extends JPanel{
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public CharacterSheetPanel() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        
        mainPanel.add(new CharacterCreationPanel(), "CHARCREATION");
        
        //ToDo figure out how to align these properly to make it look nicer
        JButton createCharButton = new JButton("Create a character");
        createCharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                cardLayout.show(mainPanel, "CHARCREATION");
            }
        });
        mainPanel.add(createCharButton);

        JButton importCharButton = new JButton("Import a character");
        mainPanel.add(importCharButton);
    }
}
