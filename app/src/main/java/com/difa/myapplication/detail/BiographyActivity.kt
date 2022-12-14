package com.difa.myapplication.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.difa.myapplication.core.utils.EXTRA_BIOGRAPHY
import com.difa.myapplication.databinding.ActivityBiographyBinding

class BiographyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBiographyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBiographyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.title = ""

        val biography = intent.getStringExtra(EXTRA_BIOGRAPHY)

        binding.tvBiography.text = biography

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}