package com.zenza.zenzaeats.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zenza.zenzaeats.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()
    }
}