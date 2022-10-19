/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author kairem
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int x = 0;
        String continuar = "s";
        
        do {
        
            
            JoptionPane.showMessageDialog(null,"O valor de x é"+x);
            continuar = JoptionPane.showInputDialog("Deseja ver o novo valor de x?");
            x++;
           while(continuar.equals(args)){
            
            
            
            
        
        }
        
            
    }
}
