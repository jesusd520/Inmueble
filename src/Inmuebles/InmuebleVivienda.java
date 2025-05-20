package Inmuebles;

public class InmuebleVivienda extends Inmueble {
    protected int habitaciones;
    protected int baños;       

    public InmuebleVivienda(int id, int area, String direccion, int habitaciones, int baños) {
        super(id, area, direccion);
        this.habitaciones = habitaciones;
        this.baños = baños;
    }
    @Override
    void imprimir(){
        super.imprimir();
        System.out.println("Numero  de habitaciones: " + habitaciones);
        System.out.println("Numero de baños: " + baños);        
    }    
}

