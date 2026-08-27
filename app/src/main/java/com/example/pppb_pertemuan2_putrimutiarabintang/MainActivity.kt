package com.example.pppb_pertemuan2_putrimutiarabintang

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pppb_pertemuan2_putrimutiarabintang.databinding.ActivityMainBinding

// buat variable untuk binding
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inisiasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // set content dari activity untuk menggunakan binding view root
        setContentView(binding.root)

        // akses ui element di code bloc
        with(receiver = binding) {

        }
    }
}