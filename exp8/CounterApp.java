import javax.swing.*;
import java.awt.*;

public class CounterApp {
    private static int count = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 100);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Counter");
        JTextField textField = new JTextField("0", 5);
        textField.setEditable(false);

        JButton countUp = new JButton("Count Up");
        JButton countDown = new JButton("Count Down");
        JButton reset = new JButton("Reset");

        countUp.addActionListener(e -> textField.setText(String.valueOf(++count)));
        countDown.addActionListener(e -> textField.setText(String.valueOf(--count)));
        reset.addActionListener(e -> {
            count = 0;
            textField.setText("0");
        });

        frame.add(label);
        frame.add(textField);
        frame.add(countUp);
        frame.add(countDown);
        frame.add(reset);

        frame.setVisible(true);
    }
}