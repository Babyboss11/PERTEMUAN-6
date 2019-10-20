package com.example.pertemuan6ke2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class ActivityKedua : AppCompatActivity() {
    lateinit var ket : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        var intent = intent
        val nim = intent.getStringExtra("NIM")
        val nama = intent.getStringExtra("NAMA")
        val nilai = intent.getStringExtra("NILAI")

        if(nilai.toInt() >=90){
            ket="A"
        } else if (nilai.toInt() >=60){
            ket="B"
        } else if (nilai.toInt() >=40){
            ket="C"
        } else if (nilai.toInt() >=20){
            ket="D"
        } else if (nilai.toInt() >=0){
            ket="E"
        }

        val resultTv = findViewById<TextView>(R.id.resultTv)

        resultTv.text = "NIM : "+nim+"\nNAMA : "+nama+"\nNilai : "+nilai+"\nKeterangan : "+ket

    }
}
