package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {
    protected static double valorArea = 2500000;
    protected double valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;
    
    public CasaConjuntoCerrado(int id, int area, String direccion, int habitaciones, int baños, int pisos, double valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(id, area, direccion, habitaciones, baños, pisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;       
    }
    
    @Override
    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administracion: " + String.format("%,.2f", valorAdministracion));
        if (tienePiscina == true) {
            System.out.println("Este conjunto tiene acceso a piscina");
        }
        else {
            System.out.println("Este conjunto no tiene acceso piscina");
        }
        if (tieneCamposDeportivos == true) {
            System.out.println("Este conjunto tiene campos deportivos");
        }
        else {
            System.out.println("Este conjunto no tiene campos deportivos");
        }
        
    }
        
} 
