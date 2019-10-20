package com.example.pertemuan6ke2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nimEt = findViewById<EditText>(R.id.nimEt)
        val namaEt = findViewById<EditText>(R.id.namaEt)
        val nilaiEt = findViewById<EditText>(R.id.nilaiEt)
        val prosesBtn = findViewById<Button>(R.id.prosesBtn)

        prosesBtn.setOnClickListener{
            var nim = nimEt.text.toString()
            var nama = namaEt.text.toString()
            var nilai = nilaiEt.text.toString()

            val intent = Intent(this@MainActivity, ActivityKedua::class.java)
            intent.putExtra("NIM", nim)
            intent.putExtra("NAMA", nama)
            intent.putExtra("NILAI", nilai)

            startActivity(intent)

        }

    }
}
