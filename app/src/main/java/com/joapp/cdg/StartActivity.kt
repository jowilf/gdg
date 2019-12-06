package com.joapp.cdg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        viewPager.adapter = PagerAdapter(supportFragmentManager)
        dots_indicator.setViewPager(viewPager)
        bottom.setOnClickListener { startActivity(Intent(this, SignInActivity::class.java)) }
    }
}
