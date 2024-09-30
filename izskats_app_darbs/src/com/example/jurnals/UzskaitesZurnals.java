package com.example.jurnals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class UzskaitesZurnals extends JFrame {


    private List<ZurnalaEntry> entries;
    private JTextArea textArea;
    private JTextField textField;
    private JList list1;

/**Pamatas izskats uzskaites zurnalam**/
    public UzskaitesZurnals() {
        entries = new ArrayList<>();
        setTitle("Uzskaites Žurnāls");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

/**Logs ievadei un arī Poga uzskaites zurnalam, izmēri, izvietojums, tex**/
        JPanel panel = new JPanel();
        textField = new JTextField(20);
        JButton addButton = new JButton("Ievietot");
        panel.add(textField);
        panel.add(addButton);
        add(panel, BorderLayout.SOUTH);



        new JPanel();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pievienotIerakstu();
            }
        });
    }

    private void pievienotIerakstu() {
        String teksts = textField.getText();
        if (!teksts.isEmpty()) {


            textArea.append(teksts + "\n");
            textField.setText("");



        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UzskaitesZurnals zurnals = new UzskaitesZurnals();
            zurnals.setVisible(true);
        });
    }
}
