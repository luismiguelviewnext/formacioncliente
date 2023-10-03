package com.curso.model;

/**
 * Clase que representa una entidad Curso en el sistema.
 * 
 * @author Luis Miguel Albarracin Castillo
 */
public class Curso {

    /*
     * Atributos
     */
    private int codCurso;
    private String nombre;
    private int duracion;
    private int precio;


    /*
     * Constructores
     */
    public Curso(int codCurso, String nombre, int duracion, int precio) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;

    }

    public Curso() {
        super();
    }

    public Curso(int codCurso) {
        super();
        this.codCurso = codCurso;
    }

    /*
     * Getters y setters
     */
    public int getCodCurso() {
        return codCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /*
     * Métodos de comparación
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codCurso;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (codCurso != other.codCurso)
            return false;
        return true;
    }

    /*
     * Método de representación en cadena
     */
    @Override
    public String toString() {
        return "Curso [codCurso=" + codCurso + ", nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio
                + "]";
    }

}
