package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected double valorAdministracion;
    public ApartamentoFamiliar(int id, int area, String direccion, int habitaciones, int baños, float valorAdministracion) {
        super(id, area, direccion, habitaciones, baños);
        this.valorAdministracion = valorAdministracion;
    }
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion: $" + String.format("%,.2f",valorAdministracion));
        System.out.println();
    }   
}
