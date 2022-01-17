package com.zenza.zenzaeats.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import com.zenza.zenzaeats.R
import com.zenza.zenzaeats.adapters.LoginCountryCodesSpinner

class LoginActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private val countryCodes = arrayOf("+254", "+256", "+255")
    private val flags = intArrayOf(
        R.drawable.flag_kenya_min,
        R.drawable.flag_uganda_min,
        R.drawable.flag_tanzania_min
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        val spinner: Spinner = findViewById(R.id.sp_login_country_codes)
        spinner.onItemSelectedListener = this

        val loginCountryCodesSpinnerAdapter = LoginCountryCodesSpinner(
            applicationContext,
            flags,
            countryCodes
        )

        spinner.adapter = loginCountryCodesSpinnerAdapter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(applicationContext, countryCodes[position], Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}