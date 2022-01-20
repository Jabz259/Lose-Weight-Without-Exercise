package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class Main {

    public static void main(String[] args) {

        //jframe
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(4,0,2,2));
        jf.setSize(400,600);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        //jf.add(TitlePane());
        jf.add(UserDetailsPane());


        jf.setVisible(true);
        ///////////

    }

    public static Component UserDetailsPane () {

        JPanel dp = new JPanel();
        dp.setLayout(new GridLayout(4,4,1,1));
        dp.setBounds(80,10,300,300);
        dp.setBackground(Color.BLACK);

        JLabel lblGender = new JLabel("Input Gender");
        lblGender.setForeground(Color.WHITE);
        lblGender.setFont(new Font ("Monospaced Bold",Font.BOLD, 17));

        JTextField genderField = new JTextField();
        genderField.setBackground(Color.white);


        JLabel lblAge= new JLabel("Input Age");
        lblAge.setForeground(Color.WHITE);
        lblAge.setFont(new Font ("Monospaced Bold",Font.BOLD, 17));

        JTextField ageField = new JTextField();
        ageField.setBackground(Color.white);

        JLabel lblWeight = new JLabel("Input Weight");
        lblWeight.setForeground(Color.WHITE);
        lblWeight.setFont(new Font ("Monospaced Bold",Font.BOLD, 17));

        JTextField weightField = new JTextField();
        weightField.setBackground(Color.white);

        JLabel lblHeight = new JLabel("Input Height");
        lblHeight.setForeground(Color.WHITE);
        lblHeight.setFont(new Font ("Monospaced Bold",Font.BOLD, 17));

        JTextField heightField = new JTextField();
        genderField.setBackground(Color.white);


        dp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        //gender components
        lblGender.setVisible(true);
        genderField.setVisible(true);

        //age components
        lblAge.setVisible(true);
        ageField.setVisible(true);

        //height components
        lblHeight.setVisible(true);
        heightField.setVisible(true);

        //weight components
        weightField.setVisible(true);
        lblWeight.setVisible(true);

        //updating the panel
        dp.setVisible(true);

        dp.add(lblGender); dp.add(genderField);
        dp.add(lblAge); dp.add(ageField);
        dp.add(lblHeight); dp.add(heightField);
        dp.add(lblWeight); dp.add(weightField);

        return dp;
    }

    public static Component TitlePane () {
        //Title
        JLabel l1 =  new JLabel("Weight Loss");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font ("Monospaced Bold",Font.BOLD, 20));

        //Test label might change it
        JLabel l2 =  new JLabel(
//                " Weight loss desktop app, input details to accuracy. ALl details will be " + "" + "processed and a caloric deficit plan will be created based on user." +
//                "Caloric deficit plan will follow a formulation which the user can use to lose a (1)lb per week without exercise (although recommended); this approach is considered the " +
//                "safest and healthiest weight loss which will " +
//                "produce effective results in the long term."
        );


        l2.setForeground(Color.WHITE);
        l2.setFont(new Font ("Monospaced Bold",Font.BOLD, 10));
        l2.setBounds(0,0,20,50);

        //panel which holds labels
        JPanel ms = new JPanel(new BorderLayout());
        ms.setBounds(80,10,100,100);
        ms.setBackground(Color.GRAY);
        ms.setLayout(new GridLayout(2,0,1,1));
        ms.setVisible(true);

        //orienttaion of the nodes/child/remember each slot has to have a component otherwise i cannot index/skip
        ms.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        //setting alignment of labels within t
        l1.setHorizontalAlignment(JLabel.CENTER);
        l2.setHorizontalAlignment(JLabel.CENTER);

//        l1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        l2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ms.add(l1);
        ms.add(l2);



        return ms;
    }






}
