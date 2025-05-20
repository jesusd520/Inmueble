package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    public static double valorArea = 3000000;
    
    public CasaIndependiente(int id, int area, String direccion, int habitaciones, int baños, int pisos) {
        super(id, area, direccion, habitaciones, baños, pisos);
    }
    void imprimir() {
        super.imprimir();
    }
}
