package com.ejercicio.factoryMethod.factory;

import com.ejercicio.factoryMethod.implementations.NotificacionEmail;
import com.ejercicio.factoryMethod.implementations.NotificacionSMS;
import com.ejercicio.factoryMethod.implementations.NotificacionWhatsApp;
import com.ejercicio.factoryMethod.interfaces.Notificacion;

public class NotificacionFactory {
    public static Notificacion crearNotificacion(String tipo){

        if(tipo.equalsIgnoreCase("SMS")) {
            return new NotificacionSMS();
        }

        if (tipo.equalsIgnoreCase("WhatsApp")) {
            return new NotificacionWhatsApp();
        }

        if (tipo.equalsIgnoreCase("Email")) {
            return new NotificacionEmail();
        }

        throw new IllegalArgumentException("Tipo de resporte no válido");
    }
}

