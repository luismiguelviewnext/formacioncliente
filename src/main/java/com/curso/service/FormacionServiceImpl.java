package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Curso;
import com.curso.model.Formacion;

/**
 * Implementación del servicio FormacionService.
 * Esta clase proporciona funcionalidades relacionadas con la formación,
 * interactuando con un microservicio externo de cursos.
 * 
 * @author Luis Miguel Albarracín Castillo
 */
@Service
public class FormacionServiceImpl implements FormacionService {

    /**
     * Inyección del bean RestTemplate para realizar llamadas a otros microservicios.
     */
    @Autowired
    private RestTemplate restTemplate; 

    /**
     * Obtiene la lista de cursos desde el microservicio de cursos y transforma
     * esos cursos en formaciones.
     * 
     * @return una lista de objetos {@link Formacion}.
     */
    @Override
    public List<Formacion> obtenerCursos() {
        Curso[] cursos = restTemplate.getForObject("http://localhost:8080/curso", Curso[].class);
        List<Formacion> formaciones = new ArrayList<>();
        for (Curso curso : cursos) {
            Formacion formacion = new Formacion();
            if (curso.getDuracion() >= 50) {
                formacion.setAsignaturas(10);
            } else {
                formacion.setAsignaturas(5);
            }
            formacion.setCurso(curso.getNombre());
            formacion.setPrecio(curso.getPrecio());
            formaciones.add(formacion);
        }
        return formaciones;
    }
    

    /**
     * Da de alta un nuevo curso en el microservicio de cursos basado en la
     * información proporcionada en el objeto {@link Formacion}.
     * Si ya existe un curso con el mismo nombre en el microservicio, no se hará nada.
     * 
     * @param formacion el objeto {@link Formacion} con la información del curso a añadir.
     */
    @Override
    public void altaCurso(Formacion formacion) {
        Curso[] cursos = restTemplate.getForObject("http://localhost:8080/curso", Curso[].class);
        boolean cursoExistente = false;

        for (Curso curso: cursos) {
            if (curso.getNombre().equals(formacion.getCurso())) {
                cursoExistente = true;
            }
        }

        if (!cursoExistente) {
            Curso nuevoCurso = new Curso();
            nuevoCurso.setNombre(formacion.getCurso());
            nuevoCurso.setDuracion(formacion.getAsignaturas() * 10);
            nuevoCurso.setPrecio(formacion.getPrecio());

            restTemplate.postForLocation("http://localhost:8080/curso", nuevoCurso);
        }
    }
}
