package com.example.appburnout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSobre: Button = findViewById(R.id.btn_sobre)
        val btnConteudo: Button = findViewById(R.id.btn_conteudo)

        btnSobre.setOnClickListener {
            val intent = Intent(this, SobreActivity::class.java)
            startActivity(intent)
        }

        btnConteudo.setOnClickListener {
            val intent = Intent(this, ConteudoActivity::class.java)
            startActivity(intent)
        }
    }
}
