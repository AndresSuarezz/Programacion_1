package banco;

public class Clientes {
    
    private String nombre;
    private String identificacion;
    private String fecchaDeNacimiento;
    private String email;
    private String telefono;
    private String sexo;
    private String ocupacion;
    private String direccion;
    private String tipoDeCuenta;
    private String contaseña;
    private boolean cdt;
    private float saldo; 
    private float credito;
    private float deuda;
    private int cuotas;
    private boolean estaAprobado = false;

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }
   
    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    
    public boolean isEstaAprobado() {
        return estaAprobado;
    }

    public void setEstaAprobado(boolean estaAprobado) {
        this.estaAprobado = estaAprobado;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }


    public boolean isCdt() {
        return cdt;
    }

    public void setCdt(boolean cdt) {
        this.cdt = cdt;
    }

    public String getContaseña() {
        return contaseña;
    }

    public void setContaseña(String contaseña) {
        this.contaseña = contaseña;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFecchaDeNacimiento() {
        return fecchaDeNacimiento;
    }

    public void setFecchaDeNacimiento(String fecchaDeNacimiento) {
        this.fecchaDeNacimiento = fecchaDeNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void calcularDeuda(float credito){
        if(getCuotas() == 6){
            deuda = (float) (credito * 0.05) + credito;
        }
        else if(getCuotas() == 8){
            deuda = (float) (credito * 0.08) + credito;
        }
        else if(getCuotas() == 12){
            deuda = (float) (credito * 0.12) + credito;
        }
        else if(getCuotas() == 14){
            deuda = (float) (credito * 0.14) + credito;
        }
        else if(getCuotas() == 24){
            deuda = (float) (credito * 0.18) + credito;
        }
    }
}