package com.example.tokosepatu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class DetailActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)

        val kembali = findViewById<ImageView>(R.id.kembali)
        val llpesan = findViewById<LinearLayout>(R.id.llpesan)

        kembali.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
        }
        llpesan.setOnClickListener{view ->
            Snackbar.make(view, "Pesanan adan akan segera di buat", Snackbar.LENGTH_SHORT).show()
        }


    }

}