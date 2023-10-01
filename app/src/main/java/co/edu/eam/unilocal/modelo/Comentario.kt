package co.edu.eam.unilocal.modelo

import java.time.LocalDate
import java.time.LocalDateTime

class Comentario(var id:Int, var texto:String, var idUsuario:Int, var idLugar:Int,
                 var calificacion:Int, var fecha:LocalDateTime) {
}