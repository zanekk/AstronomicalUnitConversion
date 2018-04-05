package kenazCode;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class windowGUI implements ActionListener{

    JButton convertButton, resetButton;
    JLabel convertResult;
    JTextField amountText;
    JComboBox firstCombo, secondCombo;
    String[] units = {"Light-year", "Meters", "Astronomical Unit","Parsec"};


    windowGUI(int width, int height){

        JFrame window = new JFrame("Astrology Unit Converter");
        window.setSize(width,height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setResizable(false);

        convertButton = new JButton("Convert");
        convertButton.setBounds(70,100,100,20);

        resetButton = new JButton("Reset");
        resetButton.setBounds(190,100,100,20);

        convertResult = new JLabel("");
        convertResult.setBounds(190,60,300,20);
        convertResult.setBackground(Color.BLUE);

        amountText = new JTextField();
        amountText.setText("Enter value");
        amountText.setBounds(20,60,150,20);

        firstCombo = new JComboBox(units);
        firstCombo.setBounds(20,20,150,20);

        secondCombo = new JComboBox(units);
        secondCombo.setBounds(190,20,150,20);

        window.add(secondCombo);
        window.add(firstCombo);
        window.add(amountText);
        window.add(convertResult);
        window.add(resetButton);
        window.add(convertButton);
        window.setVisible(true);
        convertButton.addActionListener(this);
        resetButton.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){
    Object buttonClick = e.getSource();
    ConvertingPart convertingObject ;
        if(buttonClick == convertButton){

                double textField;
               String unit1 = firstCombo.getSelectedItem().toString();
               String unit2 = secondCombo.getSelectedItem().toString();

               try {
                  textField = Double.parseDouble(amountText.getText());
                  convertingObject = new ConvertingPart(textField, unit1, unit2);
                   convertResult.setText(String.valueOf(convertingObject.conResult().doubleValue()));
               }catch(NumberFormatException ex){
                   convertResult.setForeground(Color.RED);
                   convertResult.setText("<--Wrong");
               }
        }


        else if(buttonClick == e.getSource()) {
            convertResult.setText("");
            amountText.setText("");
        }

        }
    }



