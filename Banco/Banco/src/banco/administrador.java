package banco;

public class administrador {
    private int cantClientes;
    private Clientes arregloDeClientes[];
    
    //Constructor
    public administrador(){
        cantClientes = 100;
        arregloDeClientes = new Clientes[cantClientes];
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(int cantClientes) {
        this.cantClientes = cantClientes;
    }

    public Clientes getArregloDeClientes(int posicion) {
        return arregloDeClientes[posicion];
    }

    public void setArregloDeClientes(Clientes clientes, int posicion) {
        this.arregloDeClientes[posicion] = clientes;
    }
    
    
    public Clientes[] listaDeClientes(){
        return arregloDeClientes;
    }
}
