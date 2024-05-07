import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CurrencyConverter extends JFrame {
    private JLabel kshsLabel, usdLabel, euroLabel;
    private JTextField kshsField, usdField, euroField;
    private JButton convertButton, exitButton;
    private double kshs, usd, euro;
    
    setSize(300, 200);
    setVisible(true);
    
    public CurrencyConverter() {
        setTitle("Currency Converter");
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 2));

        kshsLabel = new JLabel("Kshs: ");
        add(kshsLabel);
        kshsField = new JTextField();
        add(kshsField);

        usdLabel = new JLabel("USD: ");
        add(usdLabel);
        usdField = new JTextField();
        add(usdField);

        euroLabel = new JLabel("Euro: ");
        add(euroLabel);
        euroField = new JTextField();
        add(euroField);

        convertButton = new JButton("Convert");
        add(convertButton);
        exitButton = new JButton("Exit");
        add(exitButton);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kshs = Double.parseDouble(kshsField.getText());
                usd = kshs / 110;
                euro = kshs / 120;
                usdField.setText(String.format("%.2f", usd));
                euroField.setText(String.format("%.2f", euro));
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
