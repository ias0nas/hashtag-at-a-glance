package com.hashtagataglance.hashatagataglance

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Hashtag : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hashtag)
        this.getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
    }
}
