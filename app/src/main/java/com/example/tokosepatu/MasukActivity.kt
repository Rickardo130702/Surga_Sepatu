package com.example.tokosepatu

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MasukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.masuk)

        // Mendapatkan referensi tombol 'Masuk' yang ada di layar pertama
        val llmasuk = findViewById<LinearLayout>(R.id.llmasuk)

        llmasuk.setOnClickListener{
            val intent = Intent (this, BerandaActivity::class.java)
            startActivity(intent)
        }

    }
}