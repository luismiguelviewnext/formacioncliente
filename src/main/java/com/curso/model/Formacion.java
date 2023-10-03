package com.curso.model;

/**
 * Clase que representa una entidad Formación en el sistema.
 * 
 * @author Luis Miguel Albarracin Castillo
 */
public class Formacion {

    /** Nombre del curso. */
    private String curso;

    /** Número de asignaturas del curso. */
    private int asignaturas;

    /** Precio del curso. */
    private int precio;

    /**
     * Constructor por defecto de la clase Formación.
     */
    public Formacion() {
        super();
    }

    /**
     * Constructor con parámetros de la clase Formación.
     * 
     * @param curso Nombre del curso.
     * @param asignaturas Número de asignaturas del curso.
     * @param precio Precio del curso.
     */
    public Formacion(String curso, int asignaturas, int precio) {
        super();
        this.curso = curso;
        this.asignaturas = asignaturas;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del curso.
     * 
     * @return El nombre del curso.
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Establece el nombre del curso.
     * 
     * @param curso El nombre del curso a establecer.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Obtiene el número de asignaturas del curso.
     * 
     * @return El número de asignaturas.
     */
    public int getAsignaturas() {
        return asignaturas;
    }

    /**
     * Establece el número de asignaturas del curso.
     * 
     * @param asignaturas El número de asignaturas a establecer.
     */
    public void setAsignaturas(int asignaturas) {
        this.asignaturas = asignaturas;
    }

    /**
     * Obtiene el precio del curso.
     * 
     * @return El precio del curso.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del curso.
     * 
     * @param precio El precio a establecer.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Devuelve una representación en cadena de caracteres de la entidad Formación.
     * 
     * @return Una cadena que representa la entidad Formación.
     */
    @Override
    public String toString() {
        return "Formacion [curso=" + curso + ", asignaturas=" + asignaturas + ", precio=" + precio + "]";
    }
}
