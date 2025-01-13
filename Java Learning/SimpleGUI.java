import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create the frame (main window)
        JFrame frame = new JFrame("Simple Java GUI");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a label
        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 30, 120, 25);
        frame.add(label);

        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(180, 30, 150, 25);
        frame.add(textField);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(50, 80, 100, 30);
        frame.add(button);

        // Create a label to display the message
        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(50, 130, 300, 25);
        frame.add(messageLabel);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                if (!name.isEmpty()) {
                    messageLabel.setText("Hello, " + name + "!");
                } else {
                    messageLabel.setText("Please enter your name.");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
