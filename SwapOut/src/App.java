import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
