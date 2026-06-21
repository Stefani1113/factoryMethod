package com.ejercicio.factoryMethod.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.factoryMethod.service.NotificacionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/notificaciones")

public class NotificacionController {
    
    private NotificacionService service;

    @GetMapping("{tipo}")
    public String enviar(@PathVariable String tipo) {
        return service.enviarNotificacion(tipo);
    }
    
}
