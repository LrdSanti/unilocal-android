package co.edu.eam.unilocal.actividades

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import co.edu.eam.unilocal.R
import co.edu.eam.unilocal.bd.Usuarios
import co.edu.eam.unilocal.databinding.ActivityLoginBinding
import co.edu.eam.unilocal.databinding.ActivityRegistroBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener { login() }
    }

    fun login(){

        val correo = binding.emailUsuario.text
        val password = binding.passwordUsuario.text

        if(correo.isEmpty()){
            binding.emailLayout.isErrorEnabled = true
            binding.emailLayout.error = "Obligatorio"
        } else {
            binding.emailLayout.error = null
        }
        if(password.isEmpty()){
            binding.passwordLayout.error = "Obligatorio"
        } else {
            binding.passwordLayout.error = null
        }

        if (correo.isNotEmpty() && password.isNotEmpty()){

            try {
                val usuario = Usuarios.login(correo.toString(), password.toString())
                Toast.makeText(this, "Sus datos son correctos $correo, $password", Toast.LENGTH_LONG).show()
            }catch (e: Exception){}
            Toast.makeText(this, "sus datos son incorrectos!!", Toast.LENGTH_LONG).show()

        } else {
            Toast.makeText(this, "Los campos son obligatorios!!", Toast.LENGTH_LONG).show()
        }
    }
}