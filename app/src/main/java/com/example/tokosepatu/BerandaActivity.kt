package com.example.tokosepatu

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Html
import android.util.Log
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.tokosepatu.databinding.BerandaBinding


class BerandaActivity : AppCompatActivity() {

    private lateinit var binding: BerandaBinding
    private lateinit var adapter: ImageSliderAdapter
    private val list = ArrayList<ImageData>()
    private lateinit var dots: ArrayList<TextView>
    private lateinit var handler: Handler
    private lateinit var runnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BerandaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sepatunike = findViewById<RelativeLayout>(R.id.sepatunike)
        val sepatuconverse = findViewById<RelativeLayout>(R.id.sepatuconverse)
        val sepatuadidas = findViewById<RelativeLayout>(R.id.sepatuadidas)
        val sepatupuma = findViewById<RelativeLayout>(R.id.sepatupuma)
        val sepatunewbalance = findViewById<RelativeLayout>(R.id.sepatunewbalance)
        val sepatuchampion = findViewById<RelativeLayout>(R.id.sepatuchampion)


        sepatunike.setOnClickListener{
            val intent = Intent (this, DetailActivity::class.java)
            startActivity(intent)
        }
        sepatuconverse.setOnClickListener{
            Toast.makeText(this,"Coming Soon", Toast.LENGTH_SHORT).show()
        }
        sepatuadidas.setOnClickListener{
            Toast.makeText(this,"Coming Soon", Toast.LENGTH_SHORT).show()
        }
        sepatupuma.setOnClickListener{
            Toast.makeText(this,"Coming Soon", Toast.LENGTH_SHORT).show()
        }
        sepatunewbalance.setOnClickListener{
            Toast.makeText(this,"Coming Soon", Toast.LENGTH_SHORT).show()
        }
        sepatuchampion.setOnClickListener{
            Toast.makeText(this,"Coming Soon", Toast.LENGTH_SHORT).show()
        }


        //membuat gambar berganti secara otomatis
        //index 0 = gambar yang akan tampil pertama
        //delayMillis 1500 atau setiap 1,5 detik gambar akan berganti
        handler = Handler(Looper.getMainLooper())
        runnable = object  : Runnable {
            var index = 0
            override fun run() {
                if (index == list.size)
                    index = 0
                Log.e("Runnable,", "$index")
                binding.viewPager.setCurrentItem(index)
                index++
                handler.postDelayed(this, 1500)
            }
        }

        list.add(
            ImageData(
                R.drawable.promo01
            )
        )
        list.add(
            ImageData(
                R.drawable.promo02
            )
        )
        list.add(
            ImageData(
                R.drawable.promo3
            )
        )

        adapter = ImageSliderAdapter(list)
        binding.viewPager.adapter = adapter
        dots = ArrayList()
        setIndicator()

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                selectedDot(position)
                super.onPageSelected(position)
            }
        })


    }

    private fun selectedDot(position: Int) {
        for(i in 0 until list.size)
            if (i == position)
                dots[i].setTextColor(ContextCompat.getColor(this, R.color.blue))
        else
            dots[i].setTextColor(ContextCompat.getColor(this, R.color.purple))
    }

    private fun setIndicator() {
        for (i in 0 until list.size) {
            dots.add(TextView(this))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                dots[i].text = Html.fromHtml("&#9679", Html.FROM_HTML_MODE_LEGACY).toString()
            } else {
                dots[i].text = Html.fromHtml("&#9679")
            }
            dots[i].textSize = 18f
            binding.dotsIndicator.addView(dots[i])
        }
    }
//menambahkan onStart agar saat aplikasih di sleep dan masuk lagi gambar akan terus berganti secara otomatis
    override fun onStart() {
        super.onStart()
        handler.post(runnable)
    }
//menambahkan onStop agar saat aplikasih di tutup gambarnya berhenti berganti
    override fun onStop() {
        super.onStop()
        handler.removeCallbacks(runnable)
    }
}































