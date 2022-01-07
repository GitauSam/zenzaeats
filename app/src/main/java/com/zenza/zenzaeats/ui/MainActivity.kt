package com.zenza.zenzaeats.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.zenza.zenzaeats.R
import com.zenza.zenzaeats.adapters.CountryCodesSpinnerAdapter

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var btnNext: Button

    private val countryNames = arrayOf("+254", "+256", "+255")
    private val flags  = intArrayOf(
        R.drawable.flag_kenya_min,
        R.drawable.flag_uganda_min,
        R.drawable.flag_tanzania_min
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val spinner: Spinner = findViewById(R.id.sp_country_codes)
        spinner.onItemSelectedListener = this

        val countryCodesSpinnerAdapter = CountryCodesSpinnerAdapter(
            applicationContext,
            flags,
            countryNames
        )

        spinner.adapter = countryCodesSpinnerAdapter

        btnNext = findViewById(R.id.btn_splash_next)

        btnNext.setOnClickListener { startActivity(Intent(this, LoginActivity::class.java)) }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(applicationContext, countryNames[position], Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}