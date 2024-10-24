package com.example.navegationii

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navegationii.databinding.ActivityMainBinding

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.inicio_login)


    val inicio = findViewById<TextView>(R.id.boton_inicio)
    inicio.setOnClickListener {
        val intent = Intent(this, IniciarsesionActivity::class.java)
        startActivity(intent)
    }
    }
}

