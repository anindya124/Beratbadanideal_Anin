package com.zubet.beratbadanideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var inputNama : EditText
    private lateinit var inputTinggi : EditText
    private lateinit var jkLaki : RadioButton
    private lateinit var jkPerempuan : RadioButton
    private lateinit var proses : Button
    private lateinit var hasil : TextView
    private lateinit var agkhasil : TextView
    private var tb : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputNama = findViewById(R.id.ETnama)
        inputTinggi = findViewById(R.id.ETtinggi)
        jkLaki = findViewById(R.id.RBlaki)
        jkPerempuan = findViewById(R.id.RBperempuan)
        hasil = findViewById(R.id.txtHasil)
        agkhasil = findViewById(R.id.angkahasil)
        proses = findViewById(R.id.BTNproses)

        proses.setOnClickListener{
            var tinggi = inputTinggi.text.toString().toInt()

            if (jkLaki.isChecked){
                tb = (tinggi- 100) - ((tinggi - 100) * 10/100)
                agkhasil.setText(tb.toString()+"kg")
            }else{
                tb = (tinggi-100) - ((tinggi - 100) * 15/100)
                agkhasil.setText(tb.toString()+"kg")
            }
        }

    }
}