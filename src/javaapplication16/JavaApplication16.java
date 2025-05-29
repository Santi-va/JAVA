/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa para calcular salario neto
        //Solicitar datos de años trabajando y salario semanal
        String Años = JOptionPane.showInputDialog("A continuacion porfavor ingrese sus años trabajados en la empresa");
        int años = Integer.parseInt(Años);
        String HorasSemana = JOptionPane.showInputDialog("Por favor indique las horas trabajadas por semana para realizar los calculos correspondientes");
        int horasSemana = Integer.parseInt(HorasSemana);
        String PagoHora = JOptionPane.showInputDialog("Indique el pago por cada hora trabajada");
        int pagoHora = Integer.parseInt(PagoHora);
        //Ahora se haven los calculos
        int salarioMensual = (horasSemana * 4) * pagoHora;
        int MontoDeducido = 0;
        if (años > 12) {
            double bono = salarioMensual * 5.5 / 100;
            JOptionPane.showMessageDialog(null, "Su bono es de " + bono);
            int MontoBono = (int) (bono + salarioMensual);
            JOptionPane.showMessageDialog(null, "Su monto con el bono aplicado es de " + MontoBono);
            if (MontoBono > 2500 && MontoBono < 3500) {
                double deduccion = MontoBono * 2.7 / 100;
                JOptionPane.showMessageDialog(null, "Su deduccion del 2,7% es de" + deduccion);
                int montodeducido = (int) (MontoBono - deduccion);
                JOptionPane.showMessageDialog(null, "Su salario neto final es de " + montodeducido);
            } else if (MontoBono > 3500) {
                double deduccion = MontoBono * 3.8 / 100;
                JOptionPane.showMessageDialog(null, "Su deduccion del 3,8% es de" + deduccion);
                int montodeducido = (int) (MontoBono - deduccion);
                JOptionPane.showMessageDialog(null, "Su salario neto final es de " + montodeducido);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Su salario neto final es de " + salarioMensual);
        }

    }

}
