package manejoestudiantes;

public class materias {

    private String codigoEstudiante;
    private String materia;
    private String semestre;
    private float nota1;
    private float nota2;
    private float nota3;
    
    /*
    //Constructor
    public materias(String code, String subject, String semester, int noteOne, int noteTwo, int noteThree) {
        this.codigoEstudiante = code;
        this.materia = subject;
        this.semestre = semester;
        this.nota1 = noteOne;
        this.nota2 = noteTwo;
        this.nota3 = noteThree;
    }
    */

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    //Metodo para calcular la nota final
    public float calcNotaFinal() {
        return (getNota1() + getNota2() + getNota3()) / 3;
    }
}
