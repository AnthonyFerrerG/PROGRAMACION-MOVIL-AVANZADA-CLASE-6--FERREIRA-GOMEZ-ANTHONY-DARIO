package com.example.twoactivitiesapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SaludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        val nombre = intent.getStringExtra("nombre")
        val edad = intent.getIntExtra("edad", 0)

        tvSaludo.text = "Hola $nombre, tienes $edad años."
    }
}
