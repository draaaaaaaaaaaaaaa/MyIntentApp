package com.daffa.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {

    //untuk mengirim data ke main activty
    companion object{
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        //deklarasi
        val tvDataReceived:TextView =findViewById(R.id.tv_data_received)

        //memeangil data
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE,0)

        //untuk menerima data activty
        val text = "Name : $name\nYour Age : $age"
        tvDataReceived.text = text
    }
}