import javax.swing.*;
import java.awt.event.*;

public class ReverseNumberGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Reverse Number Finder");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter a number:");
        label.setBounds(30, 30, 120, 25);
        JTextField textField = new JTextField();
        textField.setBounds(150, 30, 150, 25);

        JButton button = new JButton("Find Reverse");
        button.setBounds(100, 70, 140, 30);

        JLabel resultLabel = new JLabel("Reversed Number: ");
        resultLabel.setBounds(30, 120, 300, 25);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(textField.getText());
                    int reverse = 0;
                    while (number != 0) {
                        int digit = number % 10;
                        reverse = reverse * 10 + digit;
                        number /= 10;
                    }
                    resultLabel.setText("Reversed Number: " + reverse);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid integer.");
                }
            }
        });

    
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
