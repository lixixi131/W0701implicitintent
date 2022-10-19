package com.example.w0701implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.w0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHompage.setOnClickListener{
            val uri = Uri.parse("https://www.naver.com")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }

        binding.btnMap.setOnClickListener{
            val uri = Uri.parse("geo:0,0?z=17&q=서울역")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }

        binding.btnTelephone.setOnClickListener{
            val uri = Uri.parse("sms:010-8597-8406")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
    }
}