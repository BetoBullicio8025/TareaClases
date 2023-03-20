package Casa;

import java.awt.*;

public class Casa {
    private double terreno;
    private String direccion;
    private Color color;
    private double ventanas;
    private boolean nueva;

    public Casa(double terreno, String direccion, Color color, double ventanas, boolean nueva) {
        this.terreno = terreno;
        this.direccion = direccion;
        this.color = color;
        this.ventanas = ventanas;
        this.nueva = nueva;
    }

    public double getTerreno() {
        return terreno;
    }

    public void setTerreno(double terreno) {
        this.terreno = terreno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVentanas() {
        return ventanas;
    }

    public void setVentanas(double ventanas) {
        this.ventanas = ventanas;
    }

    public boolean isNueva() {
        return nueva;
    }

    public void setNueva(boolean nueva) {
        this.nueva = nueva;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "terreno=" + terreno +
                ", direccion='" + direccion + '\'' +
                ", color=" + color +
                ", ventanas=" + ventanas +
                ", nueva=" + nueva +
                '}';
    }

    public void abrirPuerta() {
        boolean PuertaAbierta = true;
    }
    public void encenderLuces() {
        boolean lucesEncendidas = true;
    }
    public void cerrarVentanas() {
        System.out.println("Ventanas cerradas");

    }
}
