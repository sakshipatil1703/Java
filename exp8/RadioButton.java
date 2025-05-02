import javax.swing.*;
import java.awt.event.*;

public class RadioButton {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Select Gender:");
        label.setBounds(30, 30, 100, 25);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(30, 60, 100, 25);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(30, 90, 100, 25);

        JRadioButton otherButton = new JRadioButton("Other");
        otherButton.setBounds(30, 120, 100, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);
        group.add(otherButton);

        JButton showButton = new JButton("Submit");
        showButton.setBounds(150, 90, 100, 30);

        JLabel resultLabel = new JLabel("Selected: ");
        resultLabel.setBounds(30, 150, 200, 25);


        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (maleButton.isSelected()) {
                    resultLabel.setText("Selected: Male");
                } else if (femaleButton.isSelected()) {
                    resultLabel.setText("Selected: Female");
                } else if (otherButton.isSelected()) {
                    resultLabel.setText("Selected: Other");
                } else {
                    resultLabel.setText("No selection made.");
                }
            }
        });

  
        frame.add(label);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(otherButton);
        frame.add(showButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
