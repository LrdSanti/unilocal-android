package co.edu.eam.unilocal.actividades

import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import co.edu.eam.unilocal.R
import co.edu.eam.unilocal.bd.Usuarios
import co.edu.eam.unilocal.databinding.ActivityCrearLugarBinding
import co.edu.eam.unilocal.databinding.ActivityRegistroBinding
import co.edu.eam.unilocal.modelo.Usuario
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class RegistroActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrarse.setOnClickListener { registrarUsuario() }
/*
        binding.btnToggle.setOnClickListener { escucharEventoToggle() }
       /* binding.btnToggle.setOnCheckedChangeListener{ buttonView, isChecked ->
            val mensaje = if (isChecked) "Botón Inactivo" else "Botón Activo"

            mostrarMensaje(binding.btnToggle,mensaje);
        }*/

        binding.btnSwitch.setOnClickListener {escucharEventoSwitch()  }
        /*binding.btnSwitch.setOnCheckedChangeListener{ buttonView, isChecked ->
            val mensaje = if (isChecked) "Switch Activo" else "Switch Inactivo"

            mostrarMensaje(binding.btnToggle,mensaje);
        }*/

        binding.botonImagen.setOnClickListener{
            mostrarMensaje(binding.botonImagen, "Boton de la imagen");
        }

        binding.btnLocalizar.setOnClickListener{
            mostrarMensaje(binding.btnLocalizar, "Boton flotante")
        }*/
    }

    fun registrarUsuario(){
        val nombre = binding.nombreUsuario.text.toString();
        val nickname = binding.nicknameUsuario.text.toString();
        val email = binding.emailUsuario.text.toString();
        val password = binding.passwordUsuario.text.toString();

        if (nombre.isEmpty()){
            binding.nombreLayout.error = "Es obligatorio"
        } else {
            binding.nombreLayout.error = null
        }
        if (nickname.isEmpty()){
            binding.nicknameLayout.error = "Es obligatorio"
        } else {
            if (nickname.length > 10){
                binding.nicknameLayout.error = "Maximo 10 caracteres"
            }else {

            binding.nicknameLayout.error = null
            }
        }
        if (email.isEmpty()){
            binding.emailLayout.error = "Es obligatorio"
        } else {
            binding.emailLayout.error = null
        }
        if (password.isEmpty()){
            binding.passwordLayout.error = "Es obligatorio"
        } else {
            binding.passwordLayout.error = null
        }

        if (nombre.isNotEmpty() && nickname.isNotEmpty() && nickname.length <= 10 && email.isNotEmpty() && password.isNotEmpty()){
            val usuario = Usuario(Usuarios.tamaño()+1, nombre, nickname, email, password)
            Usuarios.agregar(usuario)
            Toast.makeText(this, "Registrado correctamente: ${usuario.id}", Toast.LENGTH_LONG).show()
        }
    }
    /*private fun escucharEventoToggle(){
        if(binding.btnToggle.isChecked){
            mostrarMensaje(binding.btnToggle, "Boton Activo")
        } else {
            mostrarMensaje(binding.btnToggle, "Boton Inactivo")
        }
    }
    private fun escucharEventoSwitch(){
        if(binding.btnSwitch.isChecked){
            mostrarMensaje(binding.btnSwitch, "Boton Activo")
        } else {
            mostrarMensaje(binding.btnSwitch, "Boton Inactivo")
        }
    }*/
    private fun mostrarMensaje(raiz: View, mensaje:String){
        //Toast.makeText(raiz, mensaje, Toast.LENGTH_LONG).show();
        Snackbar.make(this, raiz, mensaje, Snackbar.LENGTH_LONG ).show();
        println(mensaje)
    }


}