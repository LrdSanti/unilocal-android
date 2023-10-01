package co.edu.eam.unilocal.actividades

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import co.edu.eam.unilocal.R

class MainActivity : AppCompatActivity() {

    lateinit var texto:TextView
    lateinit var textoInicial:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*texto = findViewById(R.id.texto_inicial)

        if (savedInstanceState != null ){
            textoInicial = savedInstanceState.getString("texto").toString()
            texto.text = textoInicial
        }else {
            textoInicial = "Texto Inicial"
            texto.text = textoInicial
        }
        Log.e("MainActivity", "onCreate()")*/
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart()")

    }
    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause()")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity", "onResume()")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop()")

    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity", "onRestart")
    }

    /*override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("texto", textoInicial)
    }*/

    /*override fun onRestoreInstanceState(
        savedInstanceState: Bundle
    ) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("MainActivity", savedInstanceState.getString("texto").toString())


    }*/

    fun irARegistro(v:View){
       // Log.e("MainActivity","Se escucha el evento del click");

        val intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
    }

    fun irALogin(v:View){
        //Toast.makeText(this, "Se dio click al boton de login", Toast.LENGTH_LONG).show();

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun irACrearLugar(v: View){
        val intent = Intent(this, CrearLugarActivity::class.java)
        startActivity(intent)

    }

    fun irADetalleLugar(v: View){
        val intent = Intent(this, DetalleLugarActivity::class.java)
        startActivity(intent)
    }

    /*fun cambiarTexto(v: View){
        textoInicial = "Nuevo valor"
        texto.text = textoInicial
    }*/

}