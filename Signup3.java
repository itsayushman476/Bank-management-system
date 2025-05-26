package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    Signup3(String formno) {
        this.formno = formno;

        setTitle("Account Details - Page 3");
        setLayout(null);
        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(850, 800);
        setLocation(400, 20);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel l2 = new JLabel("Account Details:");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        l2.setBounds(280, 70, 400, 40);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", Font.BOLD, 16));
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r2 = new JRadioButton("Fixed Deposit Account");
        r3 = new JRadioButton("Current Account");
        r4 = new JRadioButton("Recurring Deposit Account");

        JRadioButton[] radios = {r1, r2, r3, r4};
        int y = 180;
        for (int i = 0; i < radios.length; i++) {
            radios[i].setFont(new Font("Raleway", Font.BOLD, 16));
            radios[i].setBackground(new Color(215, 252, 252));
            radios[i].setBounds(100 + (i % 2) * 250, y, 250, 30);
            if (i % 2 == 1) y += 40;
            add(radios[i]);
        }

        ButtonGroup group = new ButtonGroup();
        for (JRadioButton r : radios) group.add(r);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 300, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number):");
        l5.setFont(new Font("Raleway", Font.BOLD, 16));
        l5.setBounds(100, 330, 400, 20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway", Font.BOLD, 16));
        l6.setBounds(330, 300, 250, 30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM/cheque book and statements)");
        l7.setFont(new Font("Raleway", Font.BOLD, 16));
        l7.setBounds(330, 330, 500, 20);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", Font.BOLD, 16));
        l8.setBounds(100, 370, 400, 20);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 16));
        l9.setBounds(330, 370, 400, 20);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password):");
        l10.setFont(new Font("Raleway", Font.BOLD, 16));
        l10.setBounds(100, 400, 400, 20);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway", Font.BOLD, 16));
        l11.setBounds(100, 450, 400, 20);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c2 = new JCheckBox("Internet Banking");
        c3 = new JCheckBox("Mobile Banking");
        c4 = new JCheckBox("EMAIL ALERTS");
        c5 = new JCheckBox("Cheque Book");
        c6 = new JCheckBox("E-Statements");

        JCheckBox[] checks = {c1, c2, c3, c4, c5, c6};
        y = 500;
        for (int i = 0; i < checks.length; i++) {
            checks[i].setFont(new Font("Raleway", Font.BOLD, 16));
            checks[i].setBackground(new Color(215, 252, 252));
            checks[i].setBounds(100 + (i % 2) * 250, y, 200, 30);
            if (i % 2 == 1) y += 50;
            add(checks[i]);
        }

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 20);
        add(c7);

        JLabel l12 = new JLabel("Form No ");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760, 10, 50, 30);
        add(l13);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String atype = null;
            if (r1.isSelected()) atype = "Saving Account";
            else if (r2.isSelected()) atype = "Fixed Deposit Account";
            else if (r3.isSelected()) atype = "Current Account";
            else if (r4.isSelected()) atype = "Recurring Deposit Account";

            if (atype == null) {
                JOptionPane.showMessageDialog(null, "Please select an account type.");
                return;
            }

            if (!c7.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please confirm the declaration.");
                return;
            }

            Random ran = new Random();
            String cardno = "" + Math.abs((ran.nextLong() % 90000000L) + 1409963000000000L);
            String pin = "" + Math.abs((ran.nextLong() % 9000L) + 1000L);

            String facilities = "";
            if (c1.isSelected()) facilities += " ATM CARD";
            if (c2.isSelected()) facilities += " Internet Banking";
            if (c3.isSelected()) facilities += " Mobile Banking";
            if (c4.isSelected()) facilities += " Email Alerts";
            if (c5.isSelected()) facilities += " Cheque Book";
            if (c6.isSelected()) facilities += " E-Statements";

            try {
                Con conn = new Con();
                String q1 = "INSERT INTO signup3 VALUES('" + formno + "', '" + atype + "', '" + cardno + "', '" + pin + "', '" + facilities + "')";
                String q2 = "INSERT INTO login VALUES('" + formno + "', '" + cardno + "', '" + pin + "')";
                conn.statement.executeUpdate(q1);
                conn.statement.executeUpdate(q2);

                JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\nPIN: " + pin);
                new Deposit(pin);
                setVisible(false);
                // new Deposit(pin);  // You can open the next page here

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (e.getSource() == cancel) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Signup3("123456"); // Example form number
    }
}

