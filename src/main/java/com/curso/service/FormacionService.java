package com.curso.service;

import java.util.List;

import com.curso.model.Formacion;

/**
 * Interfaz que define los servicios relacionados con la entidad Formacion.
 * 
 * @author Luis Miguel Albarracin Castillo
 */
public interface FormacionService {

    /**
     * Obtiene una lista de todas las formaciones disponibles.
     * 
     * @return Una lista de objetos {@link Formacion} representando cada formación.
     */
    List<Formacion> obtenerCursos();

    /**
     * Da de alta una nueva formación en el sistema.
     * 
     * @param formacion El objeto {@link Formacion} con los datos de la formación a añadir.
     */
    void altaCurso(Formacion formacion);
}
