package Inmuebles;

public class Inmueble {
    
    protected int id;
    protected int  area;
    protected String direccion;
    protected double precioVenta;
    
    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion =  direccion;
    }
    double calcularPrecio(double valorArea){
        precioVenta = area*valorArea;
        return precioVenta;
    }
    void imprimir(){
        
        System.out.println("Identificador Inmobiliario: " + id);
        System.out.println("Area: " + area + " metros cuadrados");
        System.out.println("Direccion: " + direccion);
        System.out.println("Precio de venta: $" + String.format("%,.2f",precioVenta));
    }
}
