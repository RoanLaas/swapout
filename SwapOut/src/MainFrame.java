import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JPanel bottomPanel;
    private CardLayout cardLayout;
    private JPanel topPanel;

    public MainFrame(){
        // ----- Basic main setup garbo -----
        setLayout(new BorderLayout());
        setSize(1000, 600);
        setTitle("SwapOut - Desktop Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // ----- Bottom panel with all the data to be shown -----

        cardLayout = new CardLayout();
        bottomPanel = new JPanel(cardLayout);

        bottomPanel.add(new WelcomePanel(), "WELCOME");
        bottomPanel.add(new SpellBuilderPanel(), "SPELLBUILDER");
        bottomPanel.add(new CharacterSheetPanel(), "CHARSHEET");
        bottomPanel.add(new MapPanel(), "MAP");

        add(bottomPanel, BorderLayout.CENTER);
        cardLayout.show(bottomPanel, "WELCOME");


        // ----- Top panel with all the page selecty bits -----

        topPanel = new JPanel(new FlowLayout());
        topPanel.setBackground(Color.BLACK);

        JButton testButton = new JButton("Map");
        testButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed( ActionEvent e){
                cardLayout.show(bottomPanel, "MAP");
            }
        });
        topPanel.add(testButton);

        JButton testButton2 = new JButton("Character Sheet");
        testButton2.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                cardLayout.show(bottomPanel, "CHARSHEET");
            }
        });
        topPanel.add(testButton2);

        JButton testButton3 = new JButton();
        testButton3.setText("Spell Builder");
        testButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                cardLayout.show(bottomPanel, "SPELLBUILDER");
            }
        });
        topPanel.add(testButton3);

        add(topPanel, BorderLayout.NORTH);

        setVisible(true);
    } 
}


