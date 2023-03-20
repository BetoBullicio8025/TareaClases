package Pelota;

import java.awt.*;

public class Pelota {

    private String marca;
    private double precio;
    private Color  color;
    private String dueño;
    private Boolean nueva;

    public Pelota(String marca, double precio, Color color, String dueño, Boolean nueva) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.dueño = dueño;
        this.nueva = nueva;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public Boolean getNueva() {
        return nueva;
    }

    public void setNueva(Boolean nueva) {
        this.nueva = nueva;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color=" + color +
                ", dueño='" + dueño + '\'' +
                ", nueva=" + nueva +
                '}';
    }

    public void rebota(){
        System.out.println("La pelota rebota");
    }

    public double velocidad(){
        System.out.println(13);
        return 0;
    }
    public void direccion(){
        System.out.println("La pelota se mueve al Oeste");
    }

}
