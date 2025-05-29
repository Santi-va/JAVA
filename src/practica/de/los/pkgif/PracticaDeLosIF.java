/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.de.los.pkgif;

import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class PracticaDeLosIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String variable="";
        int edad=0;
        variable=JOptionPane.showInputDialog("Introduzca su edad actual");
        edad= Integer.parseInt(variable);
        if(edad>=18){JOptionPane.showMessageDialog(null, "Usted si puede votar");
        }
        else{JOptionPane.showMessageDialog(null, "Usted no puede votar");
        }
    }
    
}
