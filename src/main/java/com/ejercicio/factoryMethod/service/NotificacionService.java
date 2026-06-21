package com.ejercicio.factoryMethod.service;

import com.ejercicio.factoryMethod.factory.NotificacionFactory;
import com.ejercicio.factoryMethod.interfaces.Notificacion;

public class NotificacionService {
    
    public String enviarNotificacion(String tipo) {

        Notificacion notificacion = 
        NotificacionFactory.crearNotificacion(tipo);

        return notificacion.enviarNotificacion();
    }
}
