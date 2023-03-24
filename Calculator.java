import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator
{
    static JFrame frame;
    static JPanel panel;
    static JButton[] numberButtons = new JButton[10];
    static JButton[] operatorButtons = new JButton[12];
    static JButton addButton, subButton, multButton, divButton, decButton, equalButton, delButton, clearButton, negButton, rootButton, percentButton, fracButton;
    static JTextField textfield;
    static Font font = new Font("Arial", Font.PLAIN, 15);

    public Calculator()
    {
        frame = new JFrame();
        panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(420, 500);
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(font);
        textfield.setEditable(false);
        frame.add(textfield);

        addButton = new JButton("+");
        subButton = new JButton("-");
        divButton = new JButton("/");
        multButton = new JButton("*");
        negButton = new JButton("+/-");
        decButton = new JButton(".");
        equalButton = new JButton("=");
        fracButton = new JButton("1/x");
        delButton = new JButton("←");
        clearButton = new JButton("C");
        percentButton = new JButton("%");
        rootButton = new JButton("√");

        operatorButtons[0] = addButton;
        operatorButtons[1] = subButton;
        operatorButtons[2] = divButton;
        operatorButtons[3] = multButton;
        operatorButtons[4] = negButton;
        operatorButtons[5] = decButton;
        operatorButtons[6] = equalButton;
        operatorButtons[7] = fracButton;
        operatorButtons[8] = delButton;
        operatorButtons[9] = clearButton;
        operatorButtons[10] = percentButton;
        operatorButtons[11] = rootButton;

        for(int i = 0; i < 12; i++)
        {
            operatorButtons[i].setFont(font);
            operatorButtons[i].setFocusable(true);
        }

        for(int i = 0; i < 10; i++)
        {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(font);
            numberButtons[i].setFocusable(true);
        }

        delButton.setBounds(0, 0, 120, 60);
        clearButton.setBounds(120, 0, 60, 60);
        negButton.setBounds(180, 0, 60, 60);
        rootButton.setBounds(240, 0, 60, 60);
        numberButtons[7].setBounds(0,60,60,60);
        numberButtons[8].setBounds(60,60,60,60);
        numberButtons[9].setBounds(120,60,60,60);
        divButton.setBounds(180,60,60,60);
        percentButton.setBounds(240,60,60,60);
        numberButtons[4].setBounds(0, 120, 60, 60);
        numberButtons[5].setBounds(60, 120, 60, 60);
        numberButtons[6].setBounds(120, 120, 60, 60);
        multButton.setBounds(180,120,60,60);
        fracButton.setBounds(240,120,60,60);
        numberButtons[1].setBounds(0, 180, 60, 60);
        numberButtons[2].setBounds(60, 180, 60, 60);
        numberButtons[3].setBounds(120, 180, 60, 60);
        subButton.setBounds(180, 180, 60, 60);
        equalButton.setBounds(240,180,60,120);
        numberButtons[0].setBounds(0, 240, 120, 60);
        decButton.setBounds(120,240,60,60);
        addButton.setBounds(180, 240,60,60);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.add(delButton);
        panel.add(clearButton);
        panel.add(negButton);
        panel.add(rootButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(divButton);
        panel.add(percentButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(multButton);
        panel.add(fracButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(subButton);
        panel.add(equalButton);
        panel.add(numberButtons[0]);
        panel.add(decButton);
        panel.add(addButton);

        frame.add(panel);
    }
    public static void main(String[] args)
    {
        new Calculator();
    }
}
