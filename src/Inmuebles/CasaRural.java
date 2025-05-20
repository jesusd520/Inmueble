package Inmuebles;

public class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected int distanciaCabecera;
    protected int altitud;
    
    public CasaRural(int id, int area, String direccion, int habitaciones, int baños, int pisos, int distanciaCabecera, int altitud) {
        super(id, area, direccion, habitaciones, baños, pisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal: " + distanciaCabecera + "km");
        System.out.println("Altura sobre nivel del mar: "+ altitud + " mts");
    }   
}
