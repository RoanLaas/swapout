import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public MainFrame(){
        JPanel bottomPanel;
        JLabel testText = new JLabel("Welcome to SwapOut");

        setSize(1000, 600);
        setTitle("SwapOut - Desktop Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 9));

        // ----- Top panel with all the page selecty bits -----
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.setBackground(Color.BLACK);
        add(topPanel, BorderLayout.NORTH);

        JButton testButton = new JButton();
        testButton.setText("Testy");
        testButton.addActionListener(new ActionListener() {

            // ToDo: Have each button clear the bottom panel and set the elements to what is needed in each button
            @Override
            public void actionPerformed( ActionEvent e){
                testText.setText("Button one pressed");   
            }
        });
        topPanel.add(testButton);

        JButton testButton2 = new JButton();
        testButton2.setText("More testies");
        topPanel.add(testButton2);

        JButton testButton3 = new JButton();
        testButton3.setText("Even more testing");
        topPanel.add(testButton3);


        // ----- Bottom panel with all the data to be shown -----
        bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.setBackground(Color.RED);
        add(bottomPanel);
        add(testText);
        

        setVisible(true);
    } 
}


