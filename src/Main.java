import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fitness Tracker");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JLabel label = new JLabel("Welcome to Fitness Tracker");
        frame.add(label);

        JButton button = new JButton("Log Weight");
        frame.add(button);
    }
}
