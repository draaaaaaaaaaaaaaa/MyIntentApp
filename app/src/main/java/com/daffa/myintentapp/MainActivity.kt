package com.daffa.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //untuk mendeklarasikan button yang sudah ditambah kan di layout
        val btnMoveActivty: Button =findViewById(R.id.btn_move_activty)
        btnMoveActivty.setOnClickListener(this)

        val btnMoveWithDataActivity: Button=findViewById(R.id.btn_move_activty_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone:Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
    }
    //ini buat nge aktivin fungsi yang sudah di deklarasiin di atas
    override fun onClick(v:View?){
        when (v?.id){
            R.id.btn_move_activty -> {
            //ini buat mindahin activty nya
            val moveIntent = Intent(this@MainActivity, MoveActivty::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activty_data -> {
            val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity ::class.java)
                //buat ngirim data nama da umur
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Daffa Ramadhan A")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,5)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_dial_number ->{
                val phoneNumber ="08111109025"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }


}