/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject8;
import javax.swing.JOptionPane;


/**
 *
 * @author kairem
 */
public class Mavenproject8 {

    public static void main(String[] args)
    {
        int l = 10;
        while(l == 10){
        float x,y;
        x = (float) Float.parseFloat(JOptionPane.showInputDialog("Digite numero de tres casas"));
        if(  x >= 1 && x < 1000){
        y = x % 100;
        y = x /10;
        JOptionPane.showMessageDialog(null,"Algarismo da casa das dezenas :" + y );
        l = 11;
        }else if( x < 1 ){
        JOptionPane.showMessageDialog(null,"numero deve ser inteiro.");
        JOptionPane.showMessageDialog(null,"retorne");
        }else if( x > 100){
        JOptionPane.showMessageDialog(null,+x+" numero com mais de 3 casas.");
        JOptionPane.showMessageDialog(null,"retorne");
    }
        
        
        
}
   
    }
}
     