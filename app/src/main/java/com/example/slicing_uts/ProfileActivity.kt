package com.example.slicing_uts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.slicing_uts.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            home.setOnClickListener {
                val intentToMainActivity =
                    Intent(this@ProfileActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }
        }
    }
}