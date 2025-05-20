package Inmuebles;

public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;
    
    public Apartaestudio(int id, int area, String direccion, int habitaciones, int baños) {
        super(id, area, direccion, 1, 1);
    }
    void imprimir() {
        super.imprimir();
        System.out.println();
    }    
}
