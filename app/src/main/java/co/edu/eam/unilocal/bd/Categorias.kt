package co.edu.eam.unilocal.bd

import co.edu.eam.unilocal.modelo.CategoriaLugar

object Categorias {

    private val categorias: ArrayList<CategoriaLugar> = ArrayList()

    init {
        categorias.add(CategoriaLugar(1, "Hotel"))
        categorias.add(CategoriaLugar(2, "Cafe"))
        categorias.add(CategoriaLugar(3, "Restaurante"))
        categorias.add(CategoriaLugar(4, "Parque"))
        categorias.add(CategoriaLugar(5, "Bar"))

    }

    fun listar():ArrayList<CategoriaLugar>{
        return categorias
    }

    fun obtener(id: Int):CategoriaLugar?{
        return categorias.firstOrNull(){c -> c.id == id}
    }
}