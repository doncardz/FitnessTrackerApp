import javax.swing.*;
import java.awt.*;

public static void main(String[] args) {
    JFrame frame = new JFrame("Fitness Tracker");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());


    JLabel label = new JLabel("Welcome to Fitness Tracker");
    frame.add(label, BorderLayout.WEST);

    JTextField weightInput = new JTextField(10);
    frame.add(weightInput, BorderLayout.CENTER);

    JButton button = new JButton("Log Weight");
    frame.add(button, BorderLayout.SOUTH);

    String[] columns = {"Date", "Weight (kg)"};
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columns, 0);
    JTable table = new JTable(model);

    JScrollPane scrollPane = new JScrollPane(table);
    frame.add(scrollPane, BorderLayout.EAST);

    frame.setVisible(true);

    button.addActionListener(e -> {
        String weight = weightInput.getText();
        String date = java.time.LocalDate.now().toString();

        Object[] row = {date, weight};
        ((javax.swing.table.DefaultTableModel) table.getModel()).addRow(row);

        weightInput.setText("");
    });


  }


