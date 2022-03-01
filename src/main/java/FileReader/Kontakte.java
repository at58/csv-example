package FileReader;

import java.awt.EventQueue;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FilterReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FilterWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;


import java.util.ArrayList;
import javax.swing.border.EmptyBorder;

public class Kontakte extends JFrame {

  private ArrayList<String> Personen = new ArrayList<>();

  public static void main(String[] args) {

    EventQueue.invokeLater(()-> {
        try{
          Kontakte frame = new Kontakte();
          frame.setVisible(true);
        } catch(Exception e) {
          e.printStackTrace();
        }
    });
  }
  public Kontakte(){

    setTitle("Kontakte");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(100,100,800,600);

    JPanel contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    contentPane.setLayout(null);
    setContentPane(contentPane);



  }
}
