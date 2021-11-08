package com.example.cooldroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    internal val LOG_TAG = MainActivity::class.java.simpleName
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivCoolDroid.setOnClickListener{
            counter++
            Log.d(LOG_TAG, "onCreate(), counter: ${counter}")
            tvCoolDroid.text =
                when (counter) {
                    1 -> getString(R.string.txtOnce)
                    2 -> getString(R.string.txtTwice)
                    else -> getString(R.string.textViewNumbers, counter)
                }
        }
    }
}