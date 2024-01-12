SURGA SEPATU

Deskripsi
Surga Sepatu adalah aplikasi toko sepatu online yang memberikan pengguna pengalaman belanja sepatu yang nyaman dan menyenangkan. Dengan koleksi sepatu terbaru dan kualitas terbaik, Surga Sepatu menjadi destinasi utama untuk memenuhi kebutuhan sepatu Anda.

Fitur Utama
1. Daftar Produk: Lihat koleksi sepatu terbaru dengan deskripsi produk yang jelas dan gambar berkualitas tinggi.
2. Penawaran Khusus: Dapatkan pemberitahuan tentang penawaran khusus, diskon, dan promosi yang sedang berlangsung.
3. Proses Pemesanan Mudah: Langsung dari aplikasi, lakukan proses pemesanan dengan mudah dan aman.

Cara Menggunakan Aplikasi
Instalasi:
Unduh aplikasi melalui link :https://drive.google.com/file/d/17MVL21tELWGgsKdXPUyccbq9HKKkLhnI/view?usp=sharing

Teknologi dan Library yang Digunakan
Kotlin: Bahasa pemrograman utama untuk pengembangan aplikasi Android.
XML: Digunakan untuk mendefinisikan tata letak antarmuka pengguna.
Android Studio: Lingkungan pengembangan terpadu (IDE) untuk pengembangan aplikasi Android.

CODE APLIKASIH SURGA SEPATU

#res/layout/masuk.xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FEFEFE">

    <ImageView
        android:id="@+id/logo"
        android:layout_width="300dp"
        android:layout_height="300dp"
        android:src="@drawable/logo_surga_sepatu"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.495"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.004">
    </ImageView>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="181dp"
        android:layout_marginTop="25dp"
        android:layout_marginEnd="180dp"
        android:layout_marginBottom="48dp"
        android:gravity="center"
        android:orientation="vertical"
        app:layout_constraintBottom_toTopOf="@+id/llmasuk"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.504"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView3"
        app:layout_constraintVertical_bias="0.0">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:fontFamily="sans-serif"
            android:text="Selamat Datang di Surga Sepatu"
            android:textSize="18sp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:fontFamily="sans-serif"
            android:text="Masuk dan temukan gaya anda"
            android:textSize="18sp" />


    </LinearLayout>

    <LinearLayout
        android:id="@+id/llmasuk"
        android:layout_width="160dp"
        android:layout_height="60dp"
        android:background="@drawable/radius_corner"
        android:gravity="center"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.891">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Masuk"
            android:textColor="@color/white"
            android:textSize="26sp"
            android:textStyle="bold" />
    </LinearLayout>

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="358dp"
        android:layout_height="223dp"
        android:src="@drawable/logo1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.499" />

</androidx.constraintlayout.widget.ConstraintLayout>


#MasukActivity.kt

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



#res/layout/beranda.xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    tools:context=".BerandaActivity">

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="45dp"
        android:layout_height="45dp"
        android:src="@android:drawable/ic_menu_camera"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.016"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.01" />

    <LinearLayout
        android:id="@+id/linearLayout"
        android:layout_width="300dp"
        android:layout_height="46dp"
        android:layout_marginTop="5dp"
        android:background="@drawable/corner_search"
        android:orientation="horizontal"
        android:padding="8dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toEndOf="@+id/imageView2"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.001">

        <TextView
            android:id="@+id/tv_search"
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:layout_marginLeft="8dp"
            android:fontFamily="sans-serif"
            android:text="Search"
            android:textColor="#757575"
            android:textSize="20sp" />

        <ImageView
            android:layout_width="30dp"
            android:layout_height="30dp"
            android:layout_marginLeft="180dp"
            android:layout_marginTop="1dp"
            android:src="@drawable/icon_search" />

    </LinearLayout>


    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
       android:textSize="16sp"
        android:text="Lihat semua promo >>"
        app:layout_constraintBottom_toTopOf="@+id/view_pager"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.885" />

    <androidx.viewpager2.widget.ViewPager2
        android:id="@+id/view_pager"
        android:layout_width="match_parent"
        android:layout_height="120dp"
        android:background="@drawable/corner_search"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.171" />

    <LinearLayout
        android:id="@+id/dots_indicator"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginStart="4dp"
        android:layout_marginTop="12dp"
        android:gravity="center_vertical |center_horizontal"
        android:orientation="horizontal"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view_pager" />

    <TextView
        android:id="@+id/tvunggulan"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="56dp"
        android:text="Unggulan"
        android:textSize="20dp"
        android:textStyle="bold"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/view_pager" />

    <HorizontalScrollView
        android:id="@+id/horizontalScrollView"
        android:layout_width="match_parent"
        android:layout_height="170dp"
        android:layout_marginTop="10dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvunggulan"
        tools:ignore="SpeakableTextPresentCheck">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="170dp"
            android:orientation="horizontal">

            <RelativeLayout
                android:id="@+id/sepatunike"
                android:layout_width="200dp"
                android:layout_height="170dp"
                android:background="@drawable/corner_search">

                <com.google.android.material.imageview.ShapeableImageView
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/image_corner"
                    android:src="@drawable/nike"
                    app:shapeAppearanceOverlay="@style/roundimageview" />

            </RelativeLayout>

            <RelativeLayout
                android:id="@+id/sepatuconverse"
                android:layout_width="200dp"
                android:layout_height="170dp"
                android:layout_marginLeft="20dp"
                android:background="@drawable/corner_search">

                <com.google.android.material.imageview.ShapeableImageView
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/image_corner"
                    android:src="@drawable/converse"
                    app:shapeAppearanceOverlay="@style/roundimageview" />

            </RelativeLayout>

            <RelativeLayout
                android:id="@+id/sepatuadidas"
                android:layout_width="200dp"
                android:layout_height="170dp"
                android:layout_marginLeft="20dp"
                android:background="@drawable/corner_search">

                <com.google.android.material.imageview.ShapeableImageView
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/image_corner"
                    android:src="@drawable/adidas"
                    app:shapeAppearanceOverlay="@style/roundimageview" />

            </RelativeLayout>

        </LinearLayout>

    </HorizontalScrollView>

    <TextView
        android:id="@+id/tvpromo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="12dp"
        android:text="Promo"
        android:textSize="20dp"
        android:textStyle="bold"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/horizontalScrollView" />

    <HorizontalScrollView
        android:id="@+id/horizontalScrollView2"
        android:layout_width="match_parent"
        android:layout_height="170dp"
        android:layout_marginTop="10dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.656"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvpromo"
        tools:ignore="SpeakableTextPresentCheck">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="170dp"
            android:orientation="horizontal">

            <RelativeLayout
                android:id="@+id/sepatupuma"
                android:layout_width="200dp"
                android:layout_height="170dp"
                android:background="@drawable/corner_search">

                <com.google.android.material.imageview.ShapeableImageView
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/image_corner"
                    android:src="@drawable/puma"
                    app:shapeAppearanceOverlay="@style/roundimageview" />

            </RelativeLayout>

            <RelativeLayout
                android:id="@+id/sepatunewbalance"
                android:layout_width="200dp"
                android:layout_height="170dp"
                android:layout_marginLeft="20dp"
                android:background="@drawable/corner_search">

                <com.google.android.material.imageview.ShapeableImageView
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/image_corner"
                    android:src="@drawable/newbalance"
                    app:shapeAppearanceOverlay="@style/roundimageview" />

            </RelativeLayout>

            <RelativeLayout
                android:id="@+id/sepatuchampion"
                android:layout_width="200dp"
                android:layout_height="170dp"
                android:layout_marginLeft="20dp"
                android:background="@drawable/corner_search">

                <com.google.android.material.imageview.ShapeableImageView
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="@drawable/image_corner"
                    android:src="@drawable/champion"
                    app:shapeAppearanceOverlay="@style/roundimageview" />

            </RelativeLayout>

        </LinearLayout>

    </HorizontalScrollView>

</androidx.constraintlayout.widget.ConstraintLayout>


#BerandaActivity

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


#res/layout/detail.xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".DetailActivity">

    <RelativeLayout
        android:id="@+id/relativeLayout"
        android:layout_width="match_parent"
        android:layout_height="250dp"
        android:layout_marginBottom="481dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <com.google.android.material.imageview.ShapeableImageView
            android:layout_width="match_parent"
            android:layout_height="300dp"
            android:scaleType="centerCrop"
            android:src="@drawable/nike_detail"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <ImageView
            android:id="@+id/kembali"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:layout_marginLeft="10dp"
            android:layout_marginTop="10dp"
            android:src="@drawable/arrow_back" />

    </RelativeLayout>

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="12dp"
        android:fontFamily="sans-serif-black"
        android:text="Nike Air Force 1'07"
        android:textColor="#B3000000"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.078"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/relativeLayout"
        app:layout_constraintVertical_bias="0.0" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        android:fontFamily="sans-serif-black"
        android:text="Rp 1,729,000"
        android:textColor="#B3000000"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.078"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.0" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:background="#1A000000"
        android:gravity="center"
        android:orientation="vertical"
        app:layout_constraintBottom_toTopOf="@+id/llpesan"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView2">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Coming Soon"
            android:textSize="50sp"
            android:textColor="@color/white"
            android:rotation="20"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Detail Design"
            android:textSize="18sp"
            android:textColor="@color/white"
            android:rotation="20"/>

    </LinearLayout>

    <LinearLayout
        android:id="@+id/llpesan"
        android:layout_width="150dp"
        android:layout_height="60dp"
        android:layout_marginBottom="108dp"
        android:background="@drawable/radius_corner"
        android:gravity="center"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Pesan"
            android:textColor="@color/white"
            android:textSize="26sp"
            android:textStyle="bold" />

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


#DetailActivity

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


#res/layout/item_slide.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <com.google.android.material.imageview.ShapeableImageView
        android:id="@+id/iv_slider"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="fitXY"
        app:shapeAppearanceOverlay="@style/roundimageview"
        android:src="@drawable/ic_launcher_background"/>

</LinearLayout>


#ImageSliderAdapter.kt

class ImageSliderAdapter(private val items: List<ImageData>) : RecyclerView.Adapter<ImageSliderAdapter.ImageViewHolder>() {
    inner class ImageViewHolder(itemView: ItemSlideBinding) : RecyclerView.ViewHolder(itemView.root) {
        private val binding = itemView
        fun bind(data: ImageData){
            with(binding){
                Glide.with(itemView)
                    .load(data.imageUrl)
                    .into(ivSlider)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(ItemSlideBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }
    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(items[position])
    }
    override fun getItemCount(): Int = items.size

}


#ImageData.kt

data class ImageData(
    val imageUrl: Int
)

