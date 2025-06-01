package com.impacta.aplicativocortevip

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referência dos botões
        val btnAgendar = findViewById<Button>(R.id.button3)
        val btnServicos = findViewById<Button>(R.id.button5)
        val btnEndereco = findViewById<Button>(R.id.button6)
        val btnRa = findViewById<Button>(R.id.button7)

        // Clique para navegar
        btnAgendar.setOnClickListener {
            startActivity(Intent(this, AgendarActivity::class.java))
        }

        btnServicos.setOnClickListener {
            startActivity(Intent(this, ServicosActivity::class.java))
        }

        btnEndereco.setOnClickListener {
            startActivity(Intent(this, EnderecoActivity::class.java))
        }

        btnRa.setOnClickListener {
            startActivity(Intent(this, RaActivity::class.java))
        }
    }
}