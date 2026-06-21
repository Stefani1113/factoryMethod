package com.ejercicio.factoryMethod.implementations;

import com.ejercicio.factoryMethod.interfaces.Notificacion;

public class NotificacionSMS implements Notificacion{

    @Override
    public String enviarNotificacion(){
        return "Notificación enviada por medio de SMS";
    }
}
