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
        JLabel label = new JLabel("Enter your First Name:");
        label.setBounds(50, 30, 120, 25);
        frame.add(label);

        JLabel label2 = new JLabel("Enter your Last Name");
        label2.setBounds(50,70,120,25);
        frame.add(label2);

        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(180, 30, 150, 25);
        frame.add(textField);

        JTextField textField2 = new JTextField();
        textField2.setBounds(180, 70, 150, 25); 
        frame.add(textField2);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(70, 100, 100, 30);
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
                String name2 = textField2.getText();
                if (!name.isEmpty() && !name2.isEmpty()) {
                    messageLabel.setText("First Name: " + name + ", Last Name: " + name2);
                } else if (name.isEmpty()) {
                    messageLabel.setText("Please enter your First Name.");
                } else if (name2.isEmpty()) {
                    messageLabel.setText("Please enter your Last Name.");
                } else {
                    messageLabel.setText("Please enter both First and Last Names.");
                }
            }
            
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
