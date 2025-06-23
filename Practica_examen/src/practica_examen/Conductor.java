/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_examen;

import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class Conductor {
    private String driverName;
    private String id;
    private String drivecode;
    private int km;
    private int month;
    private String international;
    private String Nocturno;
    private String heavyWeight;
    private String deliveryStatus;
    private int mountdeb;
    private int points;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        while (id.length() < 9) {
            id = JOptionPane.showInputDialog("Su cedula debe contener 9 digitos");
        }
        this.id = id;
    }

    public String getDrivecode() {
        return drivecode;
    }

    public void setDrivecode(String drivecode) {
        this.drivecode = drivecode;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {

        this.km = km;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        while (month <= 0 || month > 12) {
            month = Integer.parseInt(JOptionPane.showInputDialog("Porfavor seleccione un mes valido del calendario"));
        }
        this.month = month;
    }

    public String getInternational() {

        return international;
    }

    public void setInternational(String international) {
        while (!international.equalsIgnoreCase("SI") && !international.equalsIgnoreCase("NO")) {
            international = JOptionPane.showInputDialog("Por favor indique con un si o un no");
        }
        if (international.equalsIgnoreCase("SI")) {

        }
        this.international = international;
    }

    public String getNocturno() {
        return Nocturno;
    }

    public void setNocturno(String Nocturno) {
        while (!Nocturno.equalsIgnoreCase("SI") && !Nocturno.equalsIgnoreCase("NO")) {
            Nocturno = JOptionPane.showInputDialog("Por favor indique con un si o un no");
        }
        this.Nocturno = Nocturno;
    }

    public String getHeavyWeight() {
        return heavyWeight;
    }

    public void setHeavyWeight(String heavyWeight) {
        while (!heavyWeight.equalsIgnoreCase("SI") && !heavyWeight.equalsIgnoreCase("NO")) {
            heavyWeight = JOptionPane.showInputDialog("Por favor indique con un si o un no");
        }
        this.heavyWeight = heavyWeight;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        while (!deliveryStatus.equalsIgnoreCase("Completado") && !deliveryStatus.equalsIgnoreCase("En proceso") && !deliveryStatus.equalsIgnoreCase("Cancelado")) {
            deliveryStatus = JOptionPane.showInputDialog("Porfavor indique con estas tres opciones: Completado, en Proceso o Cancelado dependiendo del estado del viaje");
        }
        this.deliveryStatus = deliveryStatus;
    }

    public int getMountdeb() {
        mountdeb = km * 10;
        return mountdeb;
    }

    public void setMountdeb(int mountdeb) {
        this.mountdeb = mountdeb;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
