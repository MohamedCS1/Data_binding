package com.example.data_binding

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var binding:ActivityMainBinding? = null

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.button.setOnClickListener {

            binding.textView1.text = "binding"
            binding.textView2.text = "1"
            binding.textView3.text = "2"
            binding.textView4.text = "3"
            binding.textView5.text = "4"

        }

    }
}