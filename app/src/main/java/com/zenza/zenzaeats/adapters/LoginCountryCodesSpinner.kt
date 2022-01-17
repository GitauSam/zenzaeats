package com.zenza.zenzaeats.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.zenza.zenzaeats.R

class LoginCountryCodesSpinner(
    private val context: Context,
    private val flags: IntArray,
    private val countryCodes: Array<String>,
    private val inflater: LayoutInflater = LayoutInflater.from(context)
): BaseAdapter() {

    override fun getCount(): Int {
        return flags.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = inflater.inflate(R.layout.login_country_spinner_layout, null)
        val icon = view.findViewById<ImageView>(R.id.iv_flag_country_sp)
        val names = view.findViewById<TextView>(R.id.tv_country_sp)

        icon.setImageResource(flags[position])
        names.text = countryCodes[position]

        return view
    }

}