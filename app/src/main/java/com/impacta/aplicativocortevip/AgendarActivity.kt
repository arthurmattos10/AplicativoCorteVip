package com.impacta.aplicativocortevip

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AgendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendar)

        val btnAvancar = findViewById<Button>(R.id.btnAvancar)
        btnAvancar.setOnClickListener {
            val intent = Intent(this, ConfirmarHorarioActivity::class.java)
            startActivity(intent)
        }
    }
}
