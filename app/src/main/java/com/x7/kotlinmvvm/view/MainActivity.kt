package com.x7.kotlinmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.x7.kotlinmvvm.R
import com.x7.kotlinmvvm.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button1)

        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)


        button.setOnClickListener {
            mainViewModel.change()
        }
    }


    fun updateui(text:String){

        button.text=text
    }
}