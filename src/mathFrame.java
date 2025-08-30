import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class mathFrame extends Logic implements ActionListener {

    JFrame calcBox;
    JTextField inputOutput;
    JButton bPlus; JButton bOne; JButton bTwo;
    JButton bThree; JButton bMinus; JButton bFour;
    JButton bFive; JButton bSix; JButton bDivide;
    JButton bSeven; JButton bEight; JButton bNine;
    JButton bMultiply; JButton bZero ; JButton bBack;
    JButton bEquals; JButton decimal; JButton clear;
    JPanel upper;
    JPanel lower;
    ImageIcon image = new ImageIcon(getClass().getResource("MathIcon.png"));
    mathFrame()
    {

        upper = new JPanel();
        upper.setBackground(new Color(58, 78, 150));
        upper.setBounds(40, 20, 400, 100);


        lower = new JPanel();
        lower.setBackground(Color.DARK_GRAY);
        lower.setBounds(20, 150, 440, 400);
        lower.setLayout(new FlowLayout());

        bPlus = new JButton("+");
        bPlus.setPreferredSize(new Dimension(100, 70));
        bPlus.setFocusable(false);
        bPlus.addActionListener(this);
        lower.add(bPlus);

        bOne = new JButton("1");
        bOne.setPreferredSize(new Dimension(100, 70));
        bOne.setFocusable(false);
        bOne.addActionListener(this);
        lower.add(bOne);

        bTwo = new JButton("2");
        bTwo.setPreferredSize(new Dimension(100, 70));
        bTwo.setFocusable(false);
        bTwo.addActionListener(this);
        lower.add(bTwo);

        bThree = new JButton("3");
        bThree.setPreferredSize(new Dimension(100, 70));
        bThree.setFocusable(false);
        bThree.addActionListener(this);
        lower.add(bThree);

        bMinus = new JButton("-");
        bMinus.setPreferredSize(new Dimension(100, 70));
        bMinus.setFocusable(false);
        bMinus.addActionListener(this);
        lower.add(bMinus);

        bFour = new JButton("4");
        bFour.setPreferredSize(new Dimension(100, 70));
        bFour.setFocusable(false);
        bFour.addActionListener(this);
        lower.add(bFour);

        bFive = new JButton("5");
        bFive.setPreferredSize(new Dimension(100, 70));
        bFive.setFocusable(false);
        bFive.addActionListener(this);
        lower.add(bFive);

        bSix = new JButton("6");
        bSix.setPreferredSize(new Dimension(100, 70));
        bSix.setFocusable(false);
        bSix.addActionListener(this);
        lower.add(bSix);

        bDivide = new JButton("/");
        bDivide.setPreferredSize(new Dimension(100, 70));
        bDivide.setFocusable(false);
        bDivide.addActionListener(this);
        lower.add(bDivide);

        bSeven = new JButton("7");
        bSeven.setPreferredSize(new Dimension(100, 70));
        bSeven.setFocusable(false);
        bSeven.addActionListener(this);
        lower.add(bSeven);

        bEight = new JButton("8");
        bEight.setPreferredSize(new Dimension(100, 70));
        bEight.setFocusable(false);
        bEight.addActionListener(this);
        lower.add(bEight);

        bNine = new JButton("9");
        bNine.setPreferredSize(new Dimension(100, 70));
        bNine.setFocusable(false);
        bNine.addActionListener(this);
        lower.add(bNine);

        bMultiply = new JButton("*");
        bMultiply.setPreferredSize(new Dimension(100, 70));
        bMultiply.setFocusable(false);
        bMultiply.addActionListener(this);
        lower.add(bMultiply);

        bZero = new JButton("0");
        bZero.setPreferredSize(new Dimension(100, 70));
        bZero.setFocusable(false);
        bZero.addActionListener(this);
        lower.add(bZero);

        bBack = new JButton("BACK");
        bBack.setPreferredSize(new Dimension(100, 70));
        bBack.setFocusable(false);
        bBack.addActionListener(this);
        lower.add(bBack);

        bEquals = new JButton("=");
        bEquals.setPreferredSize(new Dimension(100, 70));
        bEquals.setFocusable(false);
        bEquals.addActionListener(this);
        lower.add(bEquals);

        decimal = new JButton(".");
        decimal.setPreferredSize(new Dimension(100, 70));
        decimal.setFocusable(false);
        decimal.addActionListener(this);
        lower.add(decimal);

        clear = new JButton("clear");
        clear.setPreferredSize(new Dimension(100, 70));
        clear.setFocusable(false);
        clear.addActionListener(this);
        lower.add(clear);

        inputOutput = new JTextField();
        inputOutput.setBackground(Color.BLACK);
        inputOutput.setPreferredSize(new Dimension(300, 80));
        inputOutput.setForeground(Color.WHITE);
        inputOutput.setFont(new Font("Roboto", Font.BOLD, 30));
        upper.add(inputOutput);

        Border b = BorderFactory.createLineBorder(new Color(20, 80, 150));


        calcBox = new JFrame("Calculator 1.0");
        calcBox.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calcBox.pack();
        calcBox.setLayout(null);
        calcBox.setSize(500, 600);
        calcBox.setVisible(true);
        calcBox.setResizable(false);
        calcBox.setIconImage(image.getImage());


        calcBox.add(upper);
        calcBox.add(lower);
        calcBox.setBackground(new Color(0,110,160));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean equals = false;


        if(e.getSource() == bOne)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bOne.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else
            {
                String buttonText = bOne.getText();
                inputOutput.setText(buttonText);
            }

        }
        else if(e.getSource() == bTwo)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bTwo.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bTwo.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bThree)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bThree.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bThree.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bMinus)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bMinus.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bMinus.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bPlus)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bPlus.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bPlus.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bFour)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bFour.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bFour.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bFive)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bFive.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bFive.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bSix)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bSix.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bSix.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bDivide)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bDivide.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bDivide.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bSeven)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bSeven.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bSeven.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bEight)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bEight.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bEight.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bNine)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bNine.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bNine.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bMultiply)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bMultiply.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bMultiply.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bZero)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = bZero.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = bZero.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == bBack)
        {
            String textInBox = inputOutput.getText();
            if(textInBox.length() > 0)
            {
                String backspaced = textInBox.substring(0, textInBox.length() - 1);
                inputOutput.setText(backspaced);
            }
        }
        else if(e.getSource() == decimal)
        {
            if(inputOutput.getText().length() > 0)
            {
                String buttonText = decimal.getText();
                String addedInput = inputOutput.getText() + buttonText;
                inputOutput.setText(addedInput);
            }
            else {
                String buttonText = decimal.getText();
                inputOutput.setText(buttonText);
            }
        }
        else if(e.getSource() == clear)
        {
            inputOutput.setText("");
        }
        else if(e.getSource() == bEquals)
        {
            String textInBox = inputOutput.getText();
            if(textInBox.length() > 0)
            {
                double answer = stringToNumberCalc(textInBox);
                String text = Double.toString(answer);
                String cleanText = "";
                if(text.contains(".0"))
                {
                    cleanText = text.substring(0, text.indexOf("."));
                }
                else {
                    cleanText = text;
                }

                inputOutput.setText(cleanText);
            }
        }
    }
}
