package com.example.pppb_pertemuan2_putrimutiarabintang

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pppb_pertemuan2_putrimutiarabintang.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // buat variable untuk binding
    private lateinit var binding: ActivityMainBinding

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inisiasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // set content dari activity untuk menggunakan binding view root
        setContentView(binding.root)

        // akses ui element di code bloc
        with(receiver = binding) {
            //akses ui by id
            tvNumber.text = counter.toString()

            //ketika button count click
            btnCount.setOnClickListener {
                counter++
                tvNumber.text = counter.toString()
            }
            // ketika button toast click
            btnToast.setOnClickListener {
                Toast
                    .makeText(
                        this@MainActivity,
                        "Counter: $counter",
                        Toast.LENGTH_SHORT
                    )
                    .show()
            }

        }
    }
}