package com.example.belajarlistviewbulan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // data yang akan kita tampilkan ke dalam ListView
        val namabulan = listOf("Januari", "Februari", "Maret", "April", "Mei","Juni","Juli","Agustus","September","Oktober","November","Desember")

        // memberikan adapter ke ListView
        bulan.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namabulan)

    }
}
