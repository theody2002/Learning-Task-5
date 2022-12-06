import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class Main extends Compute {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Bayalas LT5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2, 2, 1, 1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("Compute!");

        panelTitle.setBounds(10, 10, 380, 40);
        panelOne.setBounds(10, 60, 380, 80);
        panelTwo.setBounds(10, 200, 380, 40);

        JLabel labelOne, labelTwo, labelTitle;

        final JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(20);
        tFieldOne.setPreferredSize(new Dimension(50, 20));
        tFieldTwo = new JTextField(20);
        tFieldTwo.setPreferredSize(new Dimension(50, 20));

        labelTitle = new JLabel("Lets Calculate Your Age!", JLabel.CENTER);
        labelOne = new JLabel(" What year is it now?");
        labelTwo = new JLabel(" What year were you born?");

        labelTitle.setForeground(Color.black);
        tFieldOne.setBackground(Color.white);
        tFieldTwo.setBackground(Color.white);
        tFieldOne.setForeground(Color.black);
        tFieldTwo.setForeground(Color.black);

        labelTitle.setBounds(10, 10, 90, 20);
        labelOne.setBounds(10, 10, 90, 20);
        tFieldOne.setBounds(5, 5, 100, 100);
        labelTwo.setBounds(10, 10, 90, 20);
        tFieldTwo.setBounds(5, 5, 100, 100);

        panelTitle.add(labelTitle);

        panelOne.add(labelOne);
        panelOne.add(tFieldOne);
        panelOne.add(labelTwo);
        panelOne.add(tFieldTwo);

        button.setBounds(10, 10, 90, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = computeAge(tFieldOne.getText(), tFieldTwo.getText());
                displayMessage(String.valueOf(result));
            }
        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);

        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setLayout(null);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
