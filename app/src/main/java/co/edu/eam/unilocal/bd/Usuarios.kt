package co.edu.eam.unilocal.bd

import co.edu.eam.unilocal.modelo.Usuario

object Usuarios {
    private val usuarios: ArrayList<Usuario> = ArrayList()

    init {
        usuarios.add(Usuario(1, "Santi", "lrdsanti", "santi@email.com", "123"))
        usuarios.add(Usuario(2, "Monti", "montilla", "monti@email.com", "345"))
        usuarios.add(Usuario(3, "Toro", "toro", "toro@email.com", "431"))

    }

    fun listar(): ArrayList<Usuario>{
        return usuarios;
    }

    fun agregar(usuario: Usuario){
        usuarios.add(usuario)
    }

    fun login (correo: String, password:String): Usuario{
        val respuesta = usuarios.first { u -> u.password == password && u.correo == correo }
        return respuesta;
    }

    fun tamaño(): Int{
        return usuarios.size;
    }
}