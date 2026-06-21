package com.ejercicio.factoryMethod.implementations;

import com.ejercicio.factoryMethod.interfaces.Notificacion;

public class NotificacionWhatsApp implements Notificacion{

    @Override
    public String enviarNotificacion(){
        return "Se envio notificación por medio de WhatsApp";
    }
    
}
