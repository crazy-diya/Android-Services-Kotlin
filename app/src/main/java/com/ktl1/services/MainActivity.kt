package com.ktl1.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ktl1.services.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val serviceIntent = Intent(this,MyService::class.java)
        serviceIntent.putExtra(NAME,"ALEXANDRA")
        serviceIntent.putExtra(MARK,78)

        binding.button.setOnClickListener{
            Log.i(TAG,"Starting Service")
            startService(serviceIntent)
        }

        binding.button2.setOnClickListener{
            Log.i(TAG,"Stoping Service")
            stopService(serviceIntent)
        }
    }
    companion object{
        const val TAG = "MYTAG"
        const val NAME = "NAME"
        const val MARK = "MARK"
    }
}