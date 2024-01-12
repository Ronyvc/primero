/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_mecanografia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Actividad2_mecanografia extends JFrame implements ActionListener {
    
    private JTextArea textArea;
    private JTextField inputField;
    private List<String> pangramas;
    private String pangramaActual;
    private int longitudPangrama;
    private int letrasCorrectas;

    public Actividad2_mecanografia() {
        setTitle("Práctica de Escritura");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
