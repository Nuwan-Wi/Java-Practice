import javax.swing.JOptionPane;

public class DialogInputGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name");

        String msg = String.format("Welcome, %s to JAVA programing.", name);

        JOptionPane.showMessageDialog(null, msg);
    }
    
}
