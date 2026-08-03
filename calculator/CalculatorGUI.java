package calculator;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {
    static double firstNumber;
static String operator;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java Calculator");

        frame.setLayout(null);

        JTextField display = new JTextField();
        display.setBounds(30, 30, 320, 50);
        JButton btn0 = new JButton("0");
btn0.setBounds(110, 280, 70, 50);
frame.add(btn0);
btn0.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "0");
    }
});
        JButton btn1 = new JButton("1");
btn1.setBounds(30, 220, 70, 50);
frame.add(btn1);
btn1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "1");
    }
});

JButton btn2 = new JButton("2");
btn2.setBounds(110, 220, 70, 50);
frame.add(btn2);
btn2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "2");
    }
});

JButton btn3 = new JButton("3");
btn3.setBounds(190, 220, 70, 50);
frame.add(btn3);
btn3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "3");
    }
});
        JButton btn4 = new JButton("4");
btn4.setBounds(30, 160, 70, 50);
frame.add(btn4);
btn4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "4");
    }
});

JButton btn5 = new JButton("5");
btn5.setBounds(110, 160, 70, 50);
frame.add(btn5);
btn5.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "5");
    }
});

JButton btn6 = new JButton("6");
btn6.setBounds(190, 160, 70, 50);
frame.add(btn6);
btn6.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "6");
    }
});

        frame.add(display);
        JButton btn7 = new JButton("7");
        btn7.setBounds(30, 100, 70, 50);
        frame.add(btn7);
        btn7.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "7");
    }
});
        JButton btn8 = new JButton("8");
btn8.setBounds(110, 100, 70, 50);
frame.add(btn8);
btn8.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "8");
    }
});

JButton btn9 = new JButton("9");
btn9.setBounds(190, 100, 70, 50);
frame.add(btn9);
btn9.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + "9");
    }
});
JButton btnAdd = new JButton("+");
btnAdd.setBounds(270, 100, 70, 50);
frame.add(btnAdd);
btnAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (display.getText().isEmpty()) {
            return;
        }

        firstNumber = Double.parseDouble(display.getText());
        operator = "+";
        display.setText("");
    }
});
JButton btnSub = new JButton("-");
btnSub.setBounds(270, 160, 70, 50);
frame.add(btnSub);
btnSub.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (display.getText().isEmpty()) {
            return;
        }

        firstNumber = Double.parseDouble(display.getText());
        operator = "-";
        display.setText("");
    }
});
JButton btnMul = new JButton("*");
btnMul.setBounds(270, 220, 70, 50);
frame.add(btnMul);
btnMul.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (display.getText().isEmpty()) {
            return;
        }

        firstNumber = Double.parseDouble(display.getText());
        operator = "*";
        display.setText("");
    }
});
JButton btnDiv = new JButton("/");
btnDiv.setBounds(270, 280, 70, 50);
frame.add(btnDiv);
btnDiv.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        if (display.getText().isEmpty()) {
            return;
        }

        firstNumber = Double.parseDouble(display.getText());
        operator = "/";
        display.setText("");
    }
});
JButton btnEqual = new JButton("=");
btnEqual.setBounds(30, 340, 150, 50);
frame.add(btnEqual);
btnEqual.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (display.getText().isEmpty()) {
    return;
}

        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;

        if (operator.equals("+")) {
    result = Calculator.add(firstNumber, secondNumber);

} else if (operator.equals("-")) {
    result = Calculator.subtract(firstNumber, secondNumber);

} else if (operator.equals("*")) {
    result = Calculator.multiply(firstNumber, secondNumber);

} else if (operator.equals("/")) {

    if (secondNumber != 0) {
        result = Calculator.divide(firstNumber, secondNumber);
    } else {
        display.setText("Cannot divide by 0");
        return;
    }
}

        display.setText(String.valueOf(result));
    }
});
JButton btnClear = new JButton("C");
btnClear.setBounds(190, 340, 150, 50);
frame.add(btnClear);
btnClear.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        display.setText("");
        firstNumber = 0;
        operator = "";
    }
});

        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}