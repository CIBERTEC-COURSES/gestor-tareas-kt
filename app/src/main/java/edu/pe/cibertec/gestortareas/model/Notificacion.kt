package edu.pe.cibertec.gestortareas.model

data class Notificacion(
    val mensaje:String,
    val tipo: TipoNotificacion,
    val visible: Boolean = false
)