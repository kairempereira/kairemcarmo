/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject18;
import javax.swing.JOptionPane;

/**
 *
 * @author kairem
 */
public class Mavenproject18 {

    public static void main(String[] args) {
        double saldo, nsaldo; 
                saldo = (double) Float.parseFloat(JOptionPane.showInputDialog("digite saldo: "));
                nsaldo = saldo * 1.01;
                JOptionPane.showMessageDialog(null,"novo saldo : "+ nsaldo);
        
    }
}
