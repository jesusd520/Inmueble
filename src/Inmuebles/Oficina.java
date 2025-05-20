package Inmuebles;

public class Oficina extends Local {
    protected static double valorArea = 3500000;
    protected boolean esDelGobierno;
    
    public Oficina(int id, int area, String direccion, tipo tipoLocal, boolean esDelGobierno) {
        super(id, area, direccion, tipoLocal);
        this.esDelGobierno = esDelGobierno;
    }
    @Override
    void imprimir(){
        super.imprimir();
        if (esDelGobierno == true) {
            System.out.println("Esta oficina es del gobierno");
        }
        else {
            System.out.println("Esta oficina no es del gobierno");
        }
        
    }
    
}
