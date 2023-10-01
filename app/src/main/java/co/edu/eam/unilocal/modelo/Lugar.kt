package co.edu.eam.unilocal.modelo

import java.time.LocalDateTime

class Lugar(var id:Int, var nombre:String, var descripcion:String,
            var imagenes:List<String>, var idCreador:Int, var estado:Boolean,
            var idCategoriaLugar:Int, var latitud:Float, var longitud:Float,
            var idCiudad: Int, var fechaCreacion: LocalDateTime
) {

    var telefonos:List<String> = ArrayList();
}