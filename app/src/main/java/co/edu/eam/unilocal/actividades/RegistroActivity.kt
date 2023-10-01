package co.edu.eam.unilocal.actividades

import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import co.edu.eam.unilocal.R
import com.google.android.material.snackbar.Snackbar

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val botonToggle: CompoundButton = findViewById(R.id.btn_toggle);
        val botonImagen: ImageButton = findViewById(R.id.boton_imagen);

        botonToggle.setOnCheckedChangeListener{ buttonView, isChecked ->
            val mensaje = if (isChecked) "Botón Activo" else "Botón Inactivo"

            mostrarMensaje(botonToggle,mensaje);
        }

        botonImagen.setOnClickListener{
            mostrarMensaje(botonImagen, "Boton de la imagen");
        }
    }

    private fun mostrarMensaje(raiz: View, mensaje:String){
        //Toast.makeText(raiz, mensaje, Toast.LENGTH_LONG).show();
        //Snackbar.make(this, raiz, mensaje, Snackbar.LENGTH_LONG ).show();
        println(mensaje)
    }


}