package com.ejercicio.factoryMethod.implementations;

import com.ejercicio.factoryMethod.interfaces.Notificacion;

public class NotificacionEmail implements Notificacion{

    @Override
    public String enviarNotificacion(){
        return "Se envio notificación por medio de Email";
    }
    
}
