package com.ejercicio.factoryMethod.service;

import org.springframework.stereotype.Service;

import com.ejercicio.factoryMethod.factory.NotificacionFactory;
import com.ejercicio.factoryMethod.interfaces.Notificacion;

@Service

public class NotificacionService {
    
    public String enviarNotificacion(String tipo) {

        Notificacion notificacion = 
        NotificacionFactory.crearNotificacion(tipo);

        return notificacion.enviarNotificacion();
    }
}
