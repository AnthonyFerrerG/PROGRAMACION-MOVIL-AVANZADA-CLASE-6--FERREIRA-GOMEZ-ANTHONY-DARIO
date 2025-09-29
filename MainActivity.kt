package com.example.twoactivitiesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etEdad = findViewById<EditText>(R.id.etEdad)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val edad = etEdad.text.toString().toIntOrNull() ?: 0

            val intent = Intent(this, SaludoActivity::class.java)
            intent.putExtra("nombre", nombre)
            intent.putExtra("edad", edad)
            startActivity(intent)
        }
    }
}
