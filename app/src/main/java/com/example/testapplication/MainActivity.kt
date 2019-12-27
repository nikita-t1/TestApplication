package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button.setOnClickListener()
    }

}

private fun Button.setOnClickListener() {
    Log.i("Tag", "Mesage")
    Log.i("Tag"  , "Message 2")
    Log.i("Tag"  , "Message 3")
}
