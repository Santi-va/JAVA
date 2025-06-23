/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_examen;

import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class Practica_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conductor pasanger1 = new Conductor();
        pasanger1.setDriverName(JOptionPane.showInputDialog("Registre su nombre"));
        pasanger1.setId(JOptionPane.showInputDialog("Registre su numero de cedula"));
        pasanger1.setDrivecode(JOptionPane.showInputDialog("Digite su codigo de conductor"));
        pasanger1.setKm(Integer.parseInt(JOptionPane.showInputDialog("Registre la cantidad de kilometros realizados en su viaje")));
        pasanger1.setInternational(JOptionPane.showInputDialog("Indique si su viaje fue internacional o no"));
        pasanger1.setNocturno(JOptionPane.showInputDialog("Su viaje fue nocturno?"));
        pasanger1.setHeavyWeight(JOptionPane.showInputDialog("Indique si transporta carga pesada"));
        pasanger1.setMonth(Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de mes del viaje realizado")));
        pasanger1.setDeliveryStatus(JOptionPane.showInputDialog("Indique el estado del viaje"));
        pasanger1.setMountdeb(0);
        double montoTotal = pasanger1.getMountdeb();
        double comision = 0;
        if (pasanger1.getInternational().equalsIgnoreCase("SI")) {
            double Interporcent = pasanger1.getMountdeb() * 0.15;
            JOptionPane.showMessageDialog(null, Interporcent);
            montoTotal = montoTotal + Interporcent;
            comision = comision + Interporcent;
        }
        if (pasanger1.getNocturno().equalsIgnoreCase("SI")) {
            double noctPorcent = pasanger1.getMountdeb() * 0.10;
            pasanger1.setPoints(+2);
            montoTotal = montoTotal + noctPorcent;
            comision = comision + noctPorcent;
        }
        if (pasanger1.getHeavyWeight().equalsIgnoreCase("SI")) {
            double heavyPorcent = pasanger1.getMountdeb() * 0.20;
            pasanger1.setPoints(+3);
            montoTotal = montoTotal + heavyPorcent;
            comision = comision + heavyPorcent;
        }
        if (pasanger1.getKm() > 200) {
            double distancePorcent = pasanger1.getMountdeb() * 0.05;
            pasanger1.setPoints(+1);
            montoTotal = montoTotal + distancePorcent;
        }
        if (pasanger1.getKm() > 1000) {
            int newMonto = pasanger1.getMountdeb() + 5000;
            montoTotal = montoTotal + newMonto;
            comision = comision + 5000;
        }
        JOptionPane.showMessageDialog(null, "El conductor " + pasanger1.getDriverName() + " ID: " + pasanger1.getId() + " , codigo de conductor: " + pasanger1.getDrivecode() + "");
        JOptionPane.showMessageDialog(null, "Su monto por comisiones es igual a " + comision);
        JOptionPane.showMessageDialog(null, "La cantidad de puntos obtenidas es de " + pasanger1.getPoints());

    }
}
