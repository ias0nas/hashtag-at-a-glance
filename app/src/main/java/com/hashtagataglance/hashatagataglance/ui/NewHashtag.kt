package com.hashtagataglance.hashatagataglance.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hashtagataglance.hashatagataglance.AppConfig.HashtagType.Companion.RECENT
import com.hashtagataglance.hashatagataglance.AppConfig.SharedPreferencesFileName.Companion.RECENT_HASHTAGS
import com.hashtagataglance.hashatagataglance.R
import kotlinx.android.synthetic.main.activity_new_hashtag.*

class NewHashtag : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_hashtag)
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btAddHashtag.setOnClickListener { _ ->
            addRecentHashtag(etHashtag.text.toString())
        }
    }

    fun addRecentHashtag(hashtag: String) {
        val sharedPreferences = this.getSharedPreferences(RECENT_HASHTAGS,
                android.content.Context.MODE_PRIVATE)
        sharedPreferences.edit().putInt(hashtag, RECENT).apply()
    }
}
