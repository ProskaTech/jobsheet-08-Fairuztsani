/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsprakpbo;

import javax.swing.JOptionPane;

/**
 *
 * @author Fairuz Tsani Habibi 21343044
 */
public class No3 {
      public static void main(String[]args){
        int angka;
        String a;
        
        a = JOptionPane.showInputDialog("Masukan Angka");
        angka = Integer.parseInt(a);
        
        if (angka >=0){
            JOptionPane.showMessageDialog(null, "Angka"+angka+"Merupakan bilangan Positif");
        }
        else{
            JOptionPane.showMessageDialog(null, "Angka"+angka+"Merupakan bilangan Negatif");

        }
    }
}

