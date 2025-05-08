package Week1to9.Ch01ToCh05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("簡單計算器");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2));

        JLabel label1 = new JLabel("輸入第一個數:");
        JTextField num1Field = new JTextField();
        JLabel label2 = new JLabel("輸入第二個數:");
        JTextField num2Field = new JTextField();
        JLabel resultLabel = new JLabel("結果: ");
        JLabel resultValue = new JLabel();

        String[] operations = {"加 (+)", "減 (-)", "乘 (×)", "除 (÷)"};
        JComboBox<String> operationBox = new JComboBox<>(operations);
        JButton calculateButton = new JButton("計算");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    String operation = (String) operationBox.getSelectedItem();
                    double result = 0;

                    switch (operation) {
                        case "加 (+)": result = num1 + num2; break;
                        case "減 (-)": result = num1 - num2; break;
                        case "乘 (×)": result = num1 * num2; break;
                        case "除 (÷)":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                resultValue.setText("除數不能為 0");
                                return;
                            }
                            break;
                    }
                    resultValue.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultValue.setText("請輸入有效數字");
                }
            }
        });

        frame.add(label1);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(operationBox);
        frame.add(calculateButton);
        frame.add(resultLabel);
        frame.add(resultValue);

        frame.setVisible(true);
    }
}
