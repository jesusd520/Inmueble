package Inmuebles;

public class Prueba {
    
    public static void main(String[] args) {
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(102, 120, "Cra  82 #53 AA", 3, 1, 200000);
        System.out.println("Datos del apartamento");
        apto1.calcularPrecio(ApartamentoFamiliar.valorArea);
        apto1.imprimir();
        
        System.out.println("Datos del apartamento");
        Apartaestudio apartaestudio1 = new Apartaestudio(01, 50, "Cl 50 #65", 1, 1);
        apartaestudio1.calcularPrecio(Apartaestudio.valorArea);
        apartaestudio1.imprimir();
        
    }
    
}
