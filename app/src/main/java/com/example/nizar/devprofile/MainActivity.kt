package com.example.nizar.devprofile

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create bitmap pf the image
        val bitmap = BitmapFactory.decodeResource(
                resources,R.drawable.devslopesprofilelogo)
        //rounded
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)

        rounded.cornerRadius = 15f
        logo.setImageDrawable(rounded)
    }
}
