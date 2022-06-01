package manejoestudiantes;

import java.util.Date;

public class estudiantes {

    private String codigoEstudiante;
    private String nombre;
    private String sexo;
    private Date fechaDeNacimiento;
    private String carrera;
    private String telefono;
    private String correo;

    /*
    //Constructor
    public estudiantes(String codigo, String name, String sex, Date dateBirth, String carreer, String phone, String email) {
        this.codigoEstudiante = codigo;
        this.nombre = name;
        this.sexo = sex;
        this.fechaDeNacimiento = dateBirth;
        this.carrera = carreer;
        this.telefono = phone;
        this.correo = email;
    }
    */

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
