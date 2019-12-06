package com.joapp.cdg


import android.app.Application
import uk.co.chrisjenx.calligraphy.CalligraphyConfig


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/titilliumweb_regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )
    }
}