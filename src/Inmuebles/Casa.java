package Inmuebles;

public class Casa extends InmuebleVivienda {
    protected int pisos;
            
    public Casa(int id, int area, String direccion, int habitaciones, int baños, int pisos) {
        super(id, area, direccion, habitaciones, baños);
        this.pisos = pisos;
    }
    @Override
    void imprimir(){
        super.imprimir();
        System.out.println("Numero de pisos: " + pisos);
    }   
}
