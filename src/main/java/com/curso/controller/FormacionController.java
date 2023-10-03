package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.service.FormacionService;

/**
 * Rest controller para gestionar las operaciones relacionadas con la formación.
 */
@RestController
public class FormacionController {

    @Autowired
    private FormacionService service;

    /**
     * Método GET para obtener la lista de formaciones.
     *
     * @return una lista de formaciones.
     */
    @GetMapping(value = "/formacion", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Formacion> obtenerCursos() {
        return service.obtenerCursos();
    }

    /**
     * Método POST para agregar una nueva formación.
     *
     * @param formacion el objeto de tipo {@link Formacion} que representa la formación a agregar.
     */
    @PostMapping(value = "/formacion", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaCurso(@RequestBody Formacion formacion) {
        service.altaCurso(formacion);
    }

}
