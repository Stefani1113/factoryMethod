package com.ejercicio.factoryMethod.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.factoryMethod.service.NotificacionService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/notificaciones")
@RequiredArgsConstructor

public class NotificacionController {
    
    private final NotificacionService service;

    @GetMapping("{tipo}")
    public String enviar(@PathVariable String tipo) {
        return service.enviarNotificacion(tipo);
    }
    
}
